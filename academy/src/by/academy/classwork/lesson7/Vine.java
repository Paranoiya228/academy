package by.academy.classwork.lesson7;

public class Vine extends Product {
	
	String sort;

	public Vine() {
		super();
	}

	public Vine(double price, String type, String name, int quantity, String sort) {
		super(price, type, name, quantity);
		this.sort=sort;

	}
	
	protected double calcDiscount()
	{
		if(name.contains("a"))
			return 0.9;
		return 1;
	}
	

}
