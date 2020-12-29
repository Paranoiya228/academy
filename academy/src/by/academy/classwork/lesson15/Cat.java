package by.academy.classwork.lesson15;

public class Cat {
	protected double money;
	public int weight;
	protected int height;

	@Zoo(number = "Z35F")
	protected double getMoney() {
		return money;
	}

	protected void setMoney(double money) {
		this.money = money;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	protected int getHeight() {
		return height;
	}

	protected void setHeight(int height) {
		this.height = height;
	}

}
