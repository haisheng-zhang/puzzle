package com.puzzle;

import java.util.Random;

public class PsychometricTesting {

	private static int scoreInRange(int[] scores, int low, int upper) {
		int result = 0;
		for (int score: scores) {
			if (score >= low && score <= upper) {
				++result;
			}
		}
		return result;		
	}
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
		int[] result= new int[lowerLimits.length];
		assert(lowerLimits.length == upperLimits.length);
		
		for (int i = 0; i < lowerLimits.length; ++i) {
			int lower = lowerLimits[i];
			int upper = upperLimits[i];
			result[i] = scoreInRange(scores, lower, upper);
		}
		
		return result;		
	}
	
	public static void main(String[] args) {
		int num = 5;
		int[] scores = new int[num];
		for (int i = 0; i < num; ++i) {
			scores[i] = new Random().nextInt(1000);
		}
		int limitNum = 5;
		int[] lowerLimits = new int[limitNum];
		int[] upperLimits = new int[limitNum];
		for (int i = 0; i < limitNum; ++i) {
			lowerLimits[i] = new Random().nextInt(100);
		}
		for (int i = 0; i < limitNum; ++i) {
			upperLimits[i] = new Random().nextInt(500) + 500;
		}
		
		System.out.println("----- data -------");
		for (int i = 0; i < scores.length; ++i) {
			System.out.print(" " + scores[i]);
		}
		System.out.println();

		int[] result = jobOffers(scores, lowerLimits, upperLimits);
		System.out.println("----- result -------");
		for (int i = 0; i < result.length; ++i) {
			System.out.println("result [" 
					+ lowerLimits[i] + ", " + upperLimits[i] 
					+ "] is " + result[i]);
		}
	}


}
