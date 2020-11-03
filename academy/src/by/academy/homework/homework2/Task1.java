package by.academy.homework.homework2;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] argc)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ввведите цену: ");
		double price = scan.nextDouble();
		System.out.println("Ввведите возраст: ");
		int age = scan.nextInt();
		scan.close();
		double discount=0;
		
		if(price<100) {
			price=price*0.95;
			discount = 5;}
		
		if(price>=100 && price<200) {
			price=price*0.93;
			discount = 7;}
		
		if(price>=200 && price<300)
		{
			if(age>18) {
				price=price*0.84;
				discount = 16;}
			else {
				price=price*0.91;
				discount = 9;}
		}
		
		if(price>=300 && price<400) {
			price=price*0.85;
			discount = 15;}
		
		if(price>=400){
			price=price*0.8;
			discount = 20;}
		
		System.out.println("Ваша скидка:"+ discount+"%");
		System.out.println("Итоговая цена:"+price);
	}

}
