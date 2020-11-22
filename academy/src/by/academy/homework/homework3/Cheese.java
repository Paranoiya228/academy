package by.academy.homework.homework3;

public class Cheese extends Product{
		
	String producer;

	
	public Cheese() {
		super();
	}


	public Cheese(double price, String type, String name, int quantity, String producer) {
		super(price, type, name, quantity);
		this.producer=producer;
	}



	@Override
	public double discount() {
		if(price*quantity>100)
			return 0.95;
		return 1;
	}
	
	

}