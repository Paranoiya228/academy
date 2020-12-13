package by.academy.homework.homework5;

public class Exeption {
	public static void main(String[] argc) {

		int[] arr = new int[8];

		try {
			add(arr);
		} catch (Exception e) {

			System.out.println(("Array is to small, expand the array"));
		}
	}

	public static void add(int[] arr) {
		
		int n = 10;
		
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < n; i++) {

			System.out.print(arr[i]+ " ");
		}

	}
}
