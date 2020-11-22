package by.academy.homework.homework3;

import java.util.Scanner;

import by.academy.homework.homework3.validation.BelarussianPhoneValidator;
import by.academy.homework.homework3.validation.EmailValidator;

import java.text.ParseException;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws ParseException {

		System.out.println("Введите данные ->");

		System.out.print("Продавец -> ");
		Person seller = inputPerson();

		System.out.print("Покупатель -> ");
		Person buyer = inputPerson();
		

		LocalDate today = LocalDate.now(); 
		LocalDate deadline = today.plusDays(10);
		
		System.out.println("Дата сделки -> "+ today);
		System.out.println("Дедлайн -> "+ deadline);
		
		Deal deal = new Deal(today, buyer, seller, deadline);
		deal.makeChoice(deal);
		System.out.println("-----------------");
	
		deal.printProducts();
		
//		Product[] products = deal.getProducts();
	}
	
	
	

	public static void inputProduct(int num, Deal deal) {
		
		
		System.out.println("Введите данные продукта: ");
		
		
		switch (num) 
		
		{
		case 1: {
			String name = input("\nНазвание");
			String price = input("Цена");
			String type = input("Тип");
			String quan = input("Количество");
			String sort = input("Сорт");
			
			deal.addProduct(new Bread(Double.valueOf(price), type, name, Integer.valueOf(quan), sort));
			break;
			
		}
		
		case 2: {
			String name = input("\nНазвание");
			String price = input("Цена");
			String type = input("Тип");
			String quan = input("Количество");
			String sort = input("Сорт");
			
			deal.addProduct(new Vine(Double.valueOf(price), type, name, Integer.valueOf(quan), sort));
			break;
		}
		
		case 3: {
			String name = input("\nНазвание");
			String price = input("Цена");
			String type = input("Тип");
			String quan = input("Количество");
			String producer = input("Производитель");
			
			deal.addProduct(new Cheese(Double.valueOf(price), type, name, Integer.valueOf(quan), producer));
			break;
		}
		
		default: {
			
			System.out.println("Ошибка ввода!");
			break; }
		}
	}

	
	
	private static Person inputPerson() throws ParseException {

		String personName = input("\nИмя");
		String cash = input("Сумма");
		
		
		String dateOfBirth = input("Дата рождения");
		DateFormat.isCorrectFormat(dateOfBirth);
		
		String number = input("Номер телефона");
		BelarussianPhoneValidator v = new BelarussianPhoneValidator();
		
		System.out.println("Номер "+ number + 
				(v.isValid(number)==true ? " подтверждён" : " неподтверждён"));
		
		
		
		String email = input("Почта");
		EmailValidator em = new EmailValidator();

		System.out.println("Email " + email + 
				(em.isValid(email)==true ? " подтверждён" : " неподтверждён"));
		
		
		Person person = new Person();
		
		
		person.setName(personName);
		person.setCash(Double.valueOf(cash));
		person.setDateOfBirth(dateOfBirth);
		person.setPhone(number);
		person.setEmail(email);
		
		
		return person;
	}

	
	
	private static String input(String s) {

		System.out.print(s + ": ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		return scan.next();
	}


}
