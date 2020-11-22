package by.academy.homework.homework3.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{

	@Override
	public boolean isValid(String s) {
		Pattern p = Pattern.compile("\\+1[0-9]{10}$");
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String[] argc)
	{
		AmericanPhoneValidator v = new AmericanPhoneValidator();
		System.out.println("The number +17853652430 is " + 
				(v.isValid("+17853652430")==true ? "valid" : "invalid"));
		
		
		System.out.println("The number +15813652430473 is " + 
				(v.isValid("+15813652430473")==true ? "valid" : "invalid"));
		
		
		System.out.println("The number +19253652 is " + 
				(v.isValid("+19253652")==true ? "valid" : "invalid"));
		
	}
}
