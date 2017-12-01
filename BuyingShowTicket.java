package com.puzzle;

import java.util.Random;

public class BuyingShowTicket {

	private static int howLong(int[] tickets, int position) {
		int seconds = 0;
		int ticketPosition = tickets[position];
		for (int i = 0; i < tickets.length; ++i) {
			int ticket = tickets[i];
			if (i <= position) {
				if (ticket <= ticketPosition) {
					seconds += ticket;
				} else {
					seconds += ticketPosition;
				}
			} else {
				if (ticket < ticketPosition) {
					seconds += ticket;
				} else {
					seconds += ticketPosition - 1;
				}
			}
		}
		return seconds;
	}
	
	public static void main(String[] args) {

		int cases = 5;
		int ticket = 3;
		
		int[] tickets= new int[cases];
		for (int i = 0; i < tickets.length; ++i) {
			tickets[i] = new Random().nextInt(10) + 1;
		}
		for (int i : tickets) {
			System.out.println(i);
		}
		
		int result = howLong(tickets, ticket);
		System.out.println("result for " + ticket + ":" + result);
	}

}
