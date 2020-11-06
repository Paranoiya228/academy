package by.academy.classwork.lesson4;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] argc)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		int result = 1;
		for(int i=2;i<=n;i++)
			result=result*i;
		System.out.println(result);
			
	}
}