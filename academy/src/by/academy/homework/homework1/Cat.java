package by.academy.homework.homework1;
import java.util.Scanner;

public class Cat {
	double money;
	int age;
	String nickname;
	char initials;
	boolean isHomeAnimal;
	
	public Cat() { 
	}
	public Cat(String nickname) {
		this.nickname=nickname;
	}
	
	public void grow() {
		age=age+1;
	}
	public void sleep() {
		System.out.println("Кот спит");
	}
	public void eat() {
		System.out.println("Кот ест");
	}
	public void walk() {
		System.out.println("Кот гуляет");
	}
	public int getAge()
	{
		return age;
	}
	
	public void setMoney(double money)
	{
		this.money=money;
	}
	public double getMoney()
	{
		return money;
	}
	
	public char setInitials() {
		
		this.initials=nickname.charAt(0);
		return initials;
	}
	public void getInitials() {
		System.out.println(setInitials());
	}

	public boolean setIsHomeAnimal() {
		Scanner scan = new Scanner(System.in);
        System.out.println("Это домашнее животное? 1-да, 0-нет ");
        int num = scan.nextInt();
		if(num==1)
			isHomeAnimal=true;
		return isHomeAnimal;
	}
	public void IsHomeAnimal(boolean IsHomeAnimal) {
		if(IsHomeAnimal==true)
			System.out.print("Это домашнее животное!");
		else if(IsHomeAnimal==false)
			System.out.print("Это не домашнее животное!");
	}
}
