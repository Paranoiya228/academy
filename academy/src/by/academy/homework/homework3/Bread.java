package by.academy.homework.homework3;

public class Bread extends Product {
	
	String sort;
	
	public Bread() {
		super();
	}


	public Bread(double price, String type, String name, int quantity, String sort) {
		super(price, type, name, quantity);
		this.sort=sort;
	}
	
	@Override
	public double discount()
	{
		if(getQuantity()>10)
			return 0.85;
		return 1;
	}

	
	
	
	

}
