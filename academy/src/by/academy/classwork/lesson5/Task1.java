package by.academy.classwork.lesson5;

public class Task1 {
	public static void main(String[] argc)
	{
		String s = new String();
		s="I like Java!!!";
		int l=s.length();
		System.out.println(s.charAt(l-1));
		
		System.out.println(s.endsWith("!!!"));
		System.out.println(s.startsWith("I like"));
		System.out.println(s.contains("Java"));
		
		System.out.println(s.indexOf("Java"));
		
		System.out.println(s.replace('a','o'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.substring(7,11));	
	}
}
