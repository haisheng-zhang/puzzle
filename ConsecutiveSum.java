package com.puzzle;

import java.util.Random;

public class ConsecutiveSum {

	private static int consecutiveSum(int sum) {
		int result = 0;
		for (int i = 3; i < sum/2 + 1; ++i) {
			if (sum%i == 0) {
				// say, 3 times 33 is OK, but 33 times 3 is not.
				int x = i;
				int y = sum/i;
				if ((x<y) || (x>y && x/2 < y)) {
					System.out.println(i);
					++result;
				}
			}
		}
		if (sum % 2 != 0) {
			System.out.println(2);
			++result;
		}
		return result;
	}
	
	public static void main(String[] args) {

		int sum = new Random().nextInt(100) + 1;
		int result = consecutiveSum(sum);
		System.out.println("consecutive sum of " + sum + " is " + result);
	}

}
