package by.academy.homework.homework4.Generics;

public class GenericsDemo {
	public static void main(String[] argc) {
		
		GenericsArray<Integer> array = new GenericsArray<>();
	
		array.addElement(10);
		array.addElement(5);
		array.addElement(3);
		array.addElement(9);
		
		array.showArr();
		

		System.out.println(array.get(2));
		System.out.println(array.getFirst());
		System.out.println(array.getLast());
		System.out.println(array.sizeOfArray());

		
		array.remove(2);

		array.showArr();
		
		System.out.println(array.getLastNotNull());
		

	}

}
