package by.academy.homework.homework2;
import java.util.Scanner;
import java.io.IOException;


public class Task2 {
	public static void main(String[] argc) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String s = scan.nextLine();
		switch(s) {
			case("int"):
			{
				System.out.println("Введите значение переменной: ");
				int p = scan.nextInt();
				System.out.println("Остаток от деления на 2: " + p%2);
				break;
			}
			case("double"):
			{
				System.out.println("Введите значение переменной: ");
				double p = scan.nextDouble();
				System.out.println("70% от числа: " + p*0.7);
				break;
			}
			case("float"):
			{
				System.out.println("Введите значение переменной: ");
				float p = scan.nextFloat();
				System.out.println("Квадрат числа: " + p*p);
				break;
				}
			case("char"):
			{
				System.out.println("Введите значение переменной: ");
				int p = System.in.read();
				char pp = (char) p;
				System.out.println("Код символа: " + pp + " = " + p);
				break;
			}	
				
			case("String"):
			{
				System.out.println("Введите значение переменной: ");
				String p = scan.nextLine();
				System.out.println("Hello " + p);
				break;
			}	
			default:
				System.out.println("Unsupported type");
				break;
		}
		scan.close();
	}
}
