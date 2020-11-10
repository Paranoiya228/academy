package by.academy.ArraysClassworlk;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		double[] arr =new double[4];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=scan.nextDouble();
		}
		scan.close();
		
		System.out.println(arr[0]);
	}

}
