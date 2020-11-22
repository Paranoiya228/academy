package by.academy.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson6FindPunctuationMarks {

	public static void main(String[] args) {
		
		String text = "Число 256 - это максимальное количество целых чисел,"
				+ " выражаемых с помощью одного... восьмиразрядного байта.";
		
		String regex = "\\,|:|\\;|\\?|\\.|!|-|\\.{3}|()|";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(text);
		
		int counter=0;
		
		while(m.find())
			counter++;
		
		System.out.println(counter);
		
		

	}

}
