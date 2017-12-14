package com.puzzle;

import java.util.Random;

public class InTheFuture {

	static int minNum(int a, int k, int p) {
		if (k == a) {
			return -1;
		}
		return 1 + p/(k-a);
	}
	
	public static void main(String[] args) {
		int a = new Random().nextInt(10) + 1;
		int k = new Random().nextInt(10) + a;
		int p = new Random().nextInt(30) + 1;
		int result = minNum(a, k, p);
		System.out.println("a:" + a + ", k:" + k + ", p:" + p + ", result:" + result);
	}

}
