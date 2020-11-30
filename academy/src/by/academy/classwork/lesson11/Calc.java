package by.academy.classwork.lesson11;

public class Calc {

	public static <T extends Number, V extends Number> double sum(T a, V b) {
		if (a == null && b == null) {
			System.out.println("Невозможно произвести операцию.");
			return 0;
		}
		return a.doubleValue() + b.doubleValue();
	}

	public static <T extends Number, V extends Number> double multiply(T a, V b) {
		if (a == null && b == null) {
			System.out.println("Невозможно произвести операцию.");
			return 0;
		}
		return a.doubleValue() - b.doubleValue();
	}

	public static <T extends Number, V extends Number> double devide(T a, V b) {
		if (a == null && b == null) {
			System.out.println("Невозможно произвести операцию.");
			return 0;
		}
		return a.doubleValue() / b.doubleValue();
	}

	public static <T extends Number, V extends Number> double substraction(T a, V b) {
		if (a == null && b == null) {
			System.out.println("Невозможно произвести операцию.");
			return 0;
		}
		return a.doubleValue() * b.doubleValue();
	}

}
