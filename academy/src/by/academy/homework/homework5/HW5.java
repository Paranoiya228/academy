package by.academy.homework.homework5;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HW5 {

	public static void main(String[] argc) {

		// Task
		// 1--------------------------------------------------------------------------------------

		System.out.println("Task 1: ");

		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("6");
		list.add("3");
		list.add("3");
		list.add("6");
		list.add("7");

		show(list);
		removeDuplicates(list);

		// Task
		// 2-------------------------------------------------------------------------------------

		System.out.println("\nTask 2: ");

		final int addN = 1000000;
		final int chooseN = 100000;

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		addElements(arrayList, linkedList, addN);

		System.out.println("ArrayList: " + howMuchTime(arrayList, chooseN) + " миллисекунд");
		System.out.println("LinkedList: " + howMuchTime(linkedList, chooseN) + " миллисекунд");

		// Task
		// 3--------------------------------------------------------------------------------------

		System.out.println("\nTask 3: ");

		Integer[][] arr = { { 1, 6 }, { 9, 8 }, { 1, 5, 8 } };

		IteratorTwoDimArray<Integer> iterator = new IteratorTwoDimArray<>(arr);

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		// Task
		// 4---------------------------------------------------------------------------------------

		System.out.println("\nTask 4: ");

		List<Integer> listOfMarks = new ArrayList<>();

		for (int i = 0; i < 15; i++) {
			listOfMarks.add(i, (int) (1 + Math.random() * 10));
		}

		System.out.println(listOfMarks);

		Iterator<Integer> marks = listOfMarks.iterator();
		Integer max=0;

		while (marks.hasNext()) {
			Integer temp = marks.next();
			if (temp > max) {
				max = temp;
			}

		}
		System.out.println("Максимальная оценка: " + max);

	}

	// Task 1--------------------------------------------------------------------------------
	public static <T> Set<T> removeDuplicates(List<T> arr) {

		Set<T> set = new HashSet<>(arr);
		show(set);
		return set;

	}

	public static <T> void show(Collection<T> arr) {

		for (T value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();

	}

	// Task 2------------------------------------------------------------------------------------------
	public static void addElements(Collection<Integer> arr1, Collection<Integer> arr2, int n) {

		for (int i = 0; i < n; i++) {

			arr1.add((int) (Math.random() * 5));
			arr2.add((int) (Math.random() * 5));
		}
	}

	public static long howMuchTime(List<Integer> arr, int n) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < n; i++) {

			((List<Integer>) arr).get((int) (Math.random() * 5));

		}

		long finish = System.currentTimeMillis();

		return finish - start;
	}

}