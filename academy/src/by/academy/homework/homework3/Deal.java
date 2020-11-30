package by.academy.homework.homework3;

import java.time.LocalDate;
import java.util.Scanner;

public class Deal implements DealInterface {

	public final static Integer DEFAULT_PRODUCT_SIZE = 2;
	LocalDate date;
	Person buyer;
	Person seller;
	private int productCounter;
	LocalDate deadline;
	
	

	Product[] products;

	public Deal() {
		super();
	}

	public Deal(LocalDate date, Person buyer, Person seller, LocalDate deadline) {
		super();
		this.date = date;
		this.buyer = buyer;
		this.seller = seller;
		this.deadline = deadline;
//		this.products = products;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}

	private void expandProductArray() {

		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;

	}

	@Override
	public void deal() {
		double sum = 0;
		for (Product product : products) {
			sum += product.getPrice() * product.getQuantity();
		}
		if (sum > buyer.getCash()) {
			System.out.println("Недостаточно средств! ");
		} else {
			printBill();
		}

	}

	private void printBill() {
		double sum = 0;

		System.out.println("Сделка завершена.\n");
		System.out.println("Дата сделки: " + getDate());
		System.out.println("Дедлайн: " + getDeadline());
		

		for (Product product : products) {

			double totalProductPrice = product.getPrice() * product.getQuantity();

			sum += totalProductPrice;
			System.out.println("Наименование:" + product.getName() + " " + product.getPrice() + " x "
					+ product.getQuantity() + " = " + totalProductPrice);

		}
		System.out.println("Сумма сделки: " + sum);
		buyer.setCash(buyer.getCash() - sum);
		seller.setCash(seller.getCash() + sum);
		System.out.println("Деньги покупателя: " + buyer.getCash());
		System.out.println("Деньги продавца: " + seller.getCash());
	}

	@Override
	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("\nНазвание: " + p.getName());
			System.out.println("Тип: " + p.getType());
			System.out.println("Окончательная цена: " + p.getTotalPrice());
			System.out.println("-----------------");
		}

	}

	@Override
	public void deleteProduct(String s) {
		int index = -1;
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			if (p.getName() == s) {
				index = i;
			}
		}
		if (index > products.length || index < 0) {
			System.out.println("Индекс вне допустимого диапазона");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;

	}

	public void makeChoice(Deal deal) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		choice: for(;;) {

		System.out.println("\nВыберете действие:\n 1-добавить продукт в корзину\n 2-удалить продукт из корзины\n"
				+ " 3-подсчитать сделку\n 4-закончить покупки");

		
		int ch = scan.nextInt();


			
			switch (ch) {

			case 1: {
				System.out.println("Имеющиеся продукты: 1-Bread\n 2-Vine\n 3-Cheese\n");
				System.out.println("Введите номер продукта, который вы хотите добавить: ");

				Scanner scan1 = new Scanner(System.in);

				int numToAdd = scan1.nextInt();

				Main.inputProduct(numToAdd, deal);

				scan1.close();
				break;
			}
			case 2: {

				System.out.println("\nВведите название продукта, который вы хотите удалить: ");

				Scanner scan2 = new Scanner(System.in);

				String nameToDelete = scan2.nextLine();

				scan2.close();

				deleteProduct(nameToDelete);
				break;
			}
			case 3: {

				deal();
				break;
			}
			
			case 4: {

				break choice;
			}

			default: {
				System.out.println("Ошибка ввода!");
				break;
			}
			}
		printProducts();

		} 
//		scan.close();
		

	}
}
