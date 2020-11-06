package by.academy.classwork.lesson3;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] argc)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите 2 числа: ");
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		if(m>n)
			System.out.println("Большее число:" + m);
		else
			System.out.println("Большее число:" + n);
		
		System.out.println("Среднее арифметическое:" + (m+n)/2);
	}

}
