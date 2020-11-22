package by.academy.classwork.lesson7;

public class Person {

	String name;
	double cash;

	public Person() {
		super();
	}

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public void setMoney(double cash) {
		this.cash = cash;
	}
	
	public double getMoney() {
		return cash;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
