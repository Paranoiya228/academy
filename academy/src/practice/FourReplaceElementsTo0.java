package practice;

import java.util.Arrays;

public class FourReplaceElementsTo0 {
	public static void main(String[] args)
	{
		int[] arr = new int[8];
		for(int i=0;i<arr.length;i++)
			arr[i] = 1 + (int) (Math.random()*15);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=1;i<arr.length;i+=2)
			arr[i] = 0;
		
		System.out.println(Arrays.toString(arr));
	}
}
