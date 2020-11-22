
package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lection {
	public static void main(String[] args) {
		String text = "Егор Алла Aлександр";
		Pattern pattern = Pattern.compile("А.+?а");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(text.substring(matcher.start(), matcher.end()));
		}
	}
}