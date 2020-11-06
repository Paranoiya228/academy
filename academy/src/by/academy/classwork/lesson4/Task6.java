package by.academy.classwork.lesson4;
import java.util.Scanner;
import java.io.IOException;

public class Task6 {
	public static void main(String[] argc) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int n= System.in.read();
			char x=(char)n;
			System.out.print((char)x);
		}
		scan.close();
	}
}
