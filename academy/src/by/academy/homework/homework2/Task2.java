package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] argc)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		
		String[] str=new String[n];
		
		
		for(int m=0; m<n; m++)
			str[m] = sc.next();
		
		for(int m=0; m<n; m++)
			System.out.println(str[m]);
		
		
		int min_index=0;
		int min = Unique_chars(str[0]);
		
		
		for(int i=1;i<n;i++)
		{
			if(Unique_chars(str[i])<=min)
			{
				if(Unique_chars(str[i])==min)
					continue;
				else {
					min=Unique_chars(str[i]);
					min_index=i;
					}
			}
		}
		
		sc.close();
		System.out.println();
		System.out.println(str[min_index]);
	}
	
	
	public static int Unique_chars(String s)
	{
		StringBuilder ss=new StringBuilder();
		String n;
		
		for(int i=0;i<s.length();i++)
		{
			n =String.valueOf(s.charAt(i));
			if(ss.indexOf(n)==-1)
				ss.append(n);
		}
		
		return ss.length();
	}
}

