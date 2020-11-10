package by.academy.homework.homework1;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] argc)
	{
		System.out.println("Введите число от 1 до 10: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+num+"="+num*i);
		}
		scan.close();
	}
}
