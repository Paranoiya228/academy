package by.academy.classwork.lesson7;

public class Main {

	public static void main(String[] args) {
		
		
	Person buyer = new Person("Petya", 300.00);		
	Person seller = new Person("Vasya", 200.00);	

	
	Product[] products = new Product[3];
	products[0] = new Product(10.00, "fruits", "apple", 5);
	products[1] = new Product(7.00, "fruits", "peach", 7);
	products[2] = new Product(3.00, "fruits", "banana", 15);
	
	Deal deal = new Deal("14.11.2020", buyer, seller, products);
	deal.result();
	
	
	Product vine = new Vine(40.00,"alcohole", "vine", 2, "красное");
	Product bread = new Bread(5.00, "bakery", "bread", 13, "белый");
	

	}
}
