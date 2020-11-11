package by.academy.homework.homework2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] argc) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder ss = new StringBuilder();

		String s1 = sc.nextLine();
		
		if (s1.length() % 2 != 0) {
			
			System.out.println("Error.Enter a number with an even number of characters.");
			return;
			
		}

		String sub1 = s1.substring(0, s1.length() / 2);
		System.out.println(sub1);

		String s2 = sc.nextLine();
		
		if (s2.length() % 2 != 0) {
			
			System.out.println("Error.Enter a number with an even number of characters.");
			return;
			
		}

		String sub2 = s2.substring((s2.length() / 2), s2.length());
		System.out.println(sub2);

		String word = ss.append("Final word:").append(sub1).append(sub2).toString();
		System.out.println(word);

		sc.close();
	}

}
