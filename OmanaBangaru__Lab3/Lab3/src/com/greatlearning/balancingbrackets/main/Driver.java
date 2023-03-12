package com.greatlearning.balancingbrackets.main;

import com.greatlearning.balancingbrackets.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		BalancingBrackets balancingBracket = new BalancingBrackets();
		String inputExpr = "([[{}]])";
		Boolean result;

		// Function call
		result = balancingBracket.areBracketsBalanced(inputExpr);

		if (result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}
}
