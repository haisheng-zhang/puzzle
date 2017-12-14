package com.puzzle;

import java.util.Random;

public class ConsecutiveSum {

	static int consecutive(long num) {
		int result = 0;
		for (int i = 3; i < num/2 + 1; ++i) {
			if (num%i == 0) {
				// say, 3 times 33 is OK, but 33 times 3 is not.
				int x = i;
				long y = num/i;
				if ((x<y) || (x>y && x/2 < y)) {
					System.out.println(i);
					++result;
				}
			}
		}
		if (num % 2 != 0) {
			System.out.println(2);
			++result;
		}
		return result;
	}
	
	public static void main(String[] args) {

		int num = new Random().nextInt(100) + 1;
		int result = consecutive(num);
		System.out.println("consecutive sum of " + num + " is " + result);
	}

}
