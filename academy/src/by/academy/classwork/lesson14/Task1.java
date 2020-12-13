package by.academy.classwork.lesson14;

import java.util.function.Predicate;

// 5.Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. 
// Используем функциональный интерфейс Predicate.
public class Task1 {

	public static void main(String[] argc) {

		Printable obj = s -> System.out.println(s);
		obj.print("alalalal");

		System.out.println("-------------");

		Predicate<String> checkNotNull = s -> s != null;
		System.out.println(checkNotNull.test("trututu"));

		System.out.println("-------------");

		Predicate<String> checkNotEmpty = s -> !s.isEmpty();
		System.out.println(checkNotEmpty.test(""));
		System.out.println(checkNotEmpty.test("hvbsdj"));

		System.out.println(checkNotNull.and(checkNotEmpty).test("fdfds"));

		System.out.println("-------------");

		Predicate<String> startWithJ = s -> s.startsWith("J");
		Predicate<String> startWithN = s -> s.startsWith("N");
		Predicate<String> EndWithA = s -> s.endsWith("A");

		Predicate<String> checkAll = s -> (s.startsWith("J") || s.startsWith("N") && s.endsWith("A"));

		System.out.println(startWithJ.or(startWithN).and(EndWithA).test("JAVA"));
		System.out.println(startWithJ.or(startWithN).and(EndWithA).test("NAVAA"));
		System.out.println(startWithJ.or(startWithN).and(EndWithA).test("KAVa"));
	}

}