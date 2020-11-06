package by.academy.classwork.lesson3;
import java.util.Scanner;

public class TaskFromPaper6 {
	public static void main(String[] argc)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int n = num-7;
		if(n%10==0)
			System.out.println("Число имеет на конце 7");
		else
			System.out.println("Число не имеет на конце 7");
	}

}
