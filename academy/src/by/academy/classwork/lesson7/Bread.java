package by.academy.classwork.lesson7;

public class Bread extends Product {
	
	String color;
	
	public Bread() {
		super();
	}


	public Bread(double price, String type, String name, int quantity, String color) {
		super(price, type, name, quantity);
		this.color=color;
	}
	
	
	protected double calcDiscount()
	{
		if(quantity>10)
			return 0.85;
		return 1;
	}

	
	
	
	

}
