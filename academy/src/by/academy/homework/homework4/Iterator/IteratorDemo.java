package by.academy.homework.homework4.Iterator;


public class IteratorDemo {
	
	public static void main(String[] argc) {
		
		Integer[] arr = { 1, 6, 9, 8 };

		CustomIterator<Integer> iterator = new CustomIterator<>(arr);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		}
		
	}
	


