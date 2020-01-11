package com.bridgelabz.oopsprograms;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" }; // creating the suits string object.

		// creating rank string object.
		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		shuffle(SUITS, RANKS);

	}

	public static void shuffle(String[] SUITS, String[] RANKS) {
		int[][] array = new int[SUITS.length][RANKS.length]; // create two dimentional array.
		int n = SUITS.length * RANKS.length; // total number of cards.
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		// shuffle
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		// print shuffled deck
		for (int i = 0; i < 4; i++) { // according to the given situation number of persons are Four
			array[i][0] = i + 1;
			System.out.println("** Person " + array[i][0] + " **");
			// print 9 cards to the 4 persons.
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
			}
		}
	}
}
