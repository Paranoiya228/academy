package by.academy.ArraysClassworlk;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[][] arr=new String[3][6];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] = sc.nextLine();
		}
		sc.close();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println();
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
		}
			
	}
	
}
