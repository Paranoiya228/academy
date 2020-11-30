package by.academy.homework.homework4.Date;

import java.text.ParseException;

public class DateDemo {

	public static void main(String[] argc) throws ParseException {

		Datte date = new Datte();
		date = date.createDate();

		date.DayOfWeek();
		
		String str ="25-02-2001";
		
		Datte date1 = new Datte(str);
		
		date1.isValid();
	}
}
