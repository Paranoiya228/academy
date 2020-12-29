package by.academy.classwork.lesson15;

public class Tiger {
	private int age;
	public String name;
	protected int lines;

	@Zoo(number = "Z35F")
	private void run() {
		System.out.println("Tiger running!");
	}

	public void eat(String food) {
		System.out.println("Tiger eat" + food);
	}

	protected void sleep() {
		System.out.println("Tiger sleeping");
	}
}
