package by.academy.practice;

public class SecondNechetnue {
	public static void main(String[] args)
	{
		int[] arr = new int[50];
		for(int i=0, j=1;i<arr.length;i++,j+=2) 
			arr[i]=j;
		for(int i=arr.length-1;i>=0;i--) 
			System.out.print(arr[i]+" ");
	}

}

