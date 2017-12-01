package com.puzzle;

import java.util.Random;

public class LargestSubsetSum {

	private static long lcmSum(int k) {
		long sum = 0;	
		for (int i = (int)Math.sqrt(k) + 1; i > 0; --i) {
			if (k%i == 0) {
				sum += i;
				sum += k/i; // if i*j=k, then put both i and j
				System.out.println(i + "::" + k/i);
			}
		}
		return sum;
		
	}
	private static long[] maxSubsetNum(int[] k) {
		long[] result = new long[k.length];
		for (int i = 0; i < k.length; ++i) {
			System.out.println("----- lcm " + k[i] + "-------");
			result[i] = lcmSum(k[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int num = 3;
		int[] k = new int[num];
		for (int i = 0; i < num; ++i) {
			k[i] = new Random().nextInt(1000);
		}
		long[] result = maxSubsetNum(k);
		System.out.println("----- max sum of lcm -------");
		for (int i = 0; i < num; ++i) {
			System.out.println(k[i] + " sum is " + result[i]);
		}
		

	}

}
