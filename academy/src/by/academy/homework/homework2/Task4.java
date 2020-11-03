package by.academy.homework.homework2;

public class Task4 {
	public static void main(String[] argc)
	{

		int i=0;
		int p=pow(2,i);
		while(p<=1000000)
		{
		System.out.println("2^"+i+"="+p);
		i++;
		p=pow(2,i);
		}
	}
	public static int pow(int value, int powValue)
	{
		return(int) Math.pow(value, powValue);
	}

}
