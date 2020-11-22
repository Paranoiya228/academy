package by.academy.homework.homework3;

public class Vine extends Product {
	
	String sort;

	public Vine() {
		super();
	}

	public Vine(double price, String type, String name, int quantity, String sort) {
		super(price, type, name, quantity);
		this.sort=sort;

	}
	
	@Override
	public double discount()
	{
		if(name.contains("а"))
			return 0.9;
		return 1;
	}
	

}
