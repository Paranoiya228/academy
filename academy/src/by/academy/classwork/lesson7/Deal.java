package by.academy.classwork.lesson7;

public class Deal {

	String date;
	Person buyer;
	Person seller;

	Product[] products;

	public Deal() {
		super();
	}

	public Deal(String date, Person buyer, Person seller, Product[] products) {
		super();
		this.date = date;
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
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

	public void result() {
		double sum = 0;
		for (Product product : products) {
			
			sum += product.getPrice() * product.getQuantity();
		}
		if (sum > buyer.getMoney()) {
			
			System.out.println("Недостаточно средств.");
			
		} else {
			printBill();
		}
	}

	private void printBill() {
		double sum = 0;
		
		System.out.println("Сделка завершена.");
		
		for (Product product : products) {
			
			double totalProductPrice = product.getPrice() * product.getQuantity();
			
			sum += totalProductPrice;
			System.out.println("Наименование:" + product.getName() + " " + product.getPrice() + " x "
					+ product.getQuantity() + " = " + totalProductPrice);
			
		}
		System.out.println("Сумма сделки: " + sum);
		buyer.setMoney(buyer.getMoney()-sum);
		seller.setMoney(seller.getMoney()+sum);
		System.out.println("Деньги покупателя: "+buyer.getMoney());
		System.out.println("Деньги продавца: "+seller.getMoney());
	}
}
