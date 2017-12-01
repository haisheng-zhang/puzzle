package com.puzzle;

import java.util.Random;

public class FindTheWinner {

	private static int findWinner(int[] Andrea, int[] Maria, String oddEven) {
		int result = 0;
		int start = 0;
		if (oddEven.equalsIgnoreCase("odd")) {
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
		int diff = findWinner(Andrea, Maria, oddEven);
		
		System.out.println("Andrea - Maria:" + diff);
		System.out.println("so " + (diff>0 ? "Andrea" : "Maria") + " wins");
		
		
	}

}
