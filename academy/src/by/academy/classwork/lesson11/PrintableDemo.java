package by.academy.classwork.lesson11;

public class PrintableDemo {

	public static void main(String[] args) {
		
		Printable pr = new Printable() {
			
			@Override
			public void calc() {
				System.out.println("Я вычисляю");
			}
			@Override
			public void print() {
				System.out.println("Я печатаю!");
			}
		};
		
		pr.print();
		pr.calc();

	}

}
