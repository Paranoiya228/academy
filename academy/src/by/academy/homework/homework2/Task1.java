package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] argc)
	{
		Scanner sc = new Scanner(System.in);
		
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		boolean x=Find(s1,s2);
		System.out.println(x);
		sc.close();
	}
	
	public static boolean Find(String a, String b)
	{
		if(a.length() != b.length()) 
			return false;

		int[] letters = new int[2048];

	    char[] a_array = a.toCharArray();
	    for (char c : a_array) {
	        letters[c]++;
	    }

	    for (int i = 0; i < b.length(); i++) {
	        int c = (int) b.charAt(i);
	        if (--letters[c] < 0) {
	            return false;
	        }
	    }
	    
	    return true;
	}
	

}
