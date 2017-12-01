package com.puzzle;

public class BalanceOrNot {

	static char START = '<';
	static char END = '>';

	static int balanceIt(String expression) {
		int balanceIndex = 0;
		int balance = 0;
		char[] chars = expression.toCharArray();
		for (char c : chars) {
			if (c != START && c != END) {
				// TODO do nothing for now
			} else if (c == START) {
				++balance;
			} else if (c == END) {
				--balance;
			}
			if (balance < 0) {
				++balanceIndex;
				balance = 0;
			}
		}
		if (balance > 0) {
			balanceIndex += balance;
		}
		return balanceIndex;
	}

	static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
		// TODO input check
		int[] result = new int[expressions.length];
		for (int i = 0; i < expressions.length; ++i) {
			int balanceIndex = balanceIt(expressions[i]);
			if (balanceIndex <= maxReplacements[i]) {
				result[i] = 1;
			} else {
				result[i] = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
    	
		int cases = 2;

		String[] testCases = new String[cases];
		testCases[0] = "<><<<<>>>><<>>>";
		testCases[1] = "<><><dd><><>";
		  
		int[] testCasesReplace = new int[cases];
		testCasesReplace[0] = 1;
		testCasesReplace[1] = 0;
		
        int[] result = balancedOrNot(testCases, testCasesReplace);
        for (int n: result) {
        	System.out.println(n);
        }
    }

}
