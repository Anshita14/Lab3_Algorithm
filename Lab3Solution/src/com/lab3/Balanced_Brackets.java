package com.lab3;

import java.util.Stack;

public class Balanced_Brackets {

	public static boolean checkBracketBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char character = expression.charAt(i);

			if (character == '(' || character == '{' || character == '[') {
				stack.push(character);
				continue;
			}
			if (stack.isEmpty())
				return false;

			char c;
			switch (character) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '{' || c == '(')
					return false;
				break;

			}

		}
		
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		if (checkBracketBalanced("([[{}]])".trim()) == true ) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		if (checkBracketBalanced("([[{}]]))".trim()) == true) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
