package com.greatlearning.balancingbrackets.service;

import java.util.Stack;

public class BalancingBrackets {

	// Function to check if brackets are balanced
	public Boolean areBracketsBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();

		// Traversing the input expression
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}

			// Check if stack is empty
			if (stack.isEmpty())
				return false;

			char check;
			switch (ch) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;
			}
		}

		// Check if stack is empty
		return (stack.isEmpty());
	}
}
