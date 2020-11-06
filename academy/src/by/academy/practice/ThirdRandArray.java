package by.academy.practice;

import java.util.Arrays;
import java.util.Random;

public class ThirdRandArray {
	public static void main(String[] args)
	{
		int min =0, max=9, dif=max-min, i, sum=0;
		
		int[] arr = new int[15];
		Random rand = new Random();
		for (i = 0; i < arr.length; i++) 
			arr[i] = rand.nextInt(dif+min);
		
		System.out.println(Arrays.toString(arr));
		
		for(i=0;i < arr.length;i++)
		{
			if(arr[i]%2==0)
				sum++;	
		}
		
		System.out.println(sum);

	}

}
