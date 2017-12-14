package com.puzzle;

import java.util.Random;

public class FindTheWinner {

	static String winner(int[] andrea, int[] maria, String s) {
		return diffn(andrea, maria, s) > 0 ? "Andrea" : "Maria";	
	}

	private static int diffn(int[] Andrea, int[] Maria, String s) {
		int result = 0;
		int start = 0;
		if (s.equalsIgnoreCase("odd")) {
			start = 1;
		}
		for (; start < Andrea.length; start += 2) {
			result += Andrea[start] - Maria[start];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int num = 5;
		int[] Andrea = new int[num];
		for (int i = 0; i < Andrea.length; ++i) {
			Andrea[i] = new Random().nextInt(1000);
		}
					
		System.out.println("Andrea:");
		for (int i : Andrea) {
			System.out.println(i);
		}
		int[] Maria = new int[num];
		for (int i = 0; i < Maria.length; ++i) {
			Maria[i] = new Random().nextInt(1000);
		}
		System.out.println("Maria:");
		for (int i : Maria) {
			System.out.println(i);
		}

		String oddEven = "even";
		String winner = winner(Andrea, Maria, oddEven);
		System.out.println("so " + winner + " wins");		
		
	}
}
