package by.academy.homework.homework2;

public class Task4 {
	public static void main(String[] argc)
	{

		int i=0;
		int p=(int)Math.pow(2,i);
		while(p<=1000000)
		{
		System.out.println("2^"+i+"="+p);
		i++;
		p=(int)Math.pow(2,i);
		}
	}

}
