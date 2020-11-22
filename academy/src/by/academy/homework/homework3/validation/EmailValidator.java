package by.academy.homework.homework3.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	@Override
	public boolean isValid(String s) {
		Pattern p = Pattern.compile("^(.+)@(.+)$");
		Matcher m = p.matcher(s);
		return m.find();
	}
	
	public static void main(String[] argc)
	{
		EmailValidator v = new EmailValidator();
		System.out.println("The Email address nastya.r.824@gmail.com is " + 
				(v.isValid("nastya.r.824@gmail.com")==true ? "valid" : "invalid"));
		
		
		System.out.println("The Email address nastya.r.824@gmail.com is " + 
				(v.isValid("@nastya.r.824gmail.com")==true ? "valid" : "invalid"));
		
		
		System.out.println("The Email address nastya.r.824@gmail.com is " + 
				(v.isValid("nastya.r.824gmail.com")==true ? "valid" : "invalid"));
	}

}

