package by.academy.homework.homework2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {

		String suits[] = { "Черв", "Буба", "Треф", "Пика" };

		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };

		Scanner sc = new Scanner(System.in);
		int players = sc.nextInt();
		sc.close();

		int cards = 5;

		int num_cards = cards * players;

		if (num_cards > 36) {

			System.out.println("Too many playes.");
			return;
		}

		else if (players == 0) {
			System.out.println("Game over.");
			return;
		}

		else if (players < 0) {
			System.out.println("The number of players can't be negative.");
			return;
		}

		String[] deck = new String[52];

		for (int i = 0; i < rank.length; i++) {

			for (int j = 0; j < suits.length; j++) {

				deck[suits.length * i + j] = rank[i] + "-" + suits[j];

			}

		}

		for (int i = 0; i < num_cards; i++) {

			int r = i + (int) (Math.random() * (52 - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;

		}

		for (int i = 0; i < players * cards; i++) {

			System.out.println(deck[i]);

			if (i % cards == cards - 1) {
				System.out.println();
			}

		}

	}

}
