package by.academy.homework.homework3.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarussianPhoneValidator implements Validator {

	@Override
	public boolean isValid(String s) {
		Pattern p = Pattern.compile("\\+375((29)|(33)|(25)|(44))[0-9]{7}$");
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String[] argc)
	{
		BelarussianPhoneValidator v = new BelarussianPhoneValidator();
		
		System.out.println("The number +375291000000 is " + 
				(v.isValid("+375291000000")==true ? "valid" : "invalid"));
		
		
		System.out.println("The number +3754498765 is " + 
				(v.isValid("+3754498765")==true ? "valid" : "invalid"));
		
		System.out.println("The number +37525987655434534 is " + 
				(v.isValid("+37525987655434534")==true ? "valid" : "invalid"));
		
	}
}
