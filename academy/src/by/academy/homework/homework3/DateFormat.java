package by.academy.homework.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {
	public static void isCorrectFormat(String date) throws ParseException {


		String st1Pattern = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
		String st2Pattern = "^[0-9]{2}-[0-9]{2}-[0-9]{4}$";

		if (CheckFormat(st1Pattern, date) == true) {
			
			showResult(CheckFormat(st1Pattern, date));
			ParseDate("dd/MM/yyyy", "День: dd\nМесяц: MM\nГод: yyyy\n", date);
			
		} else if(CheckFormat(st2Pattern, date) == true){
			
			showResult(CheckFormat(st2Pattern, date));
			ParseDate("dd-MM-yyyy", "День: dd\nМесяц: MM\nГод: yyyy\n", date);

			
		}else {
			
			System.out.println("Неверный  формат даты!");
		}

	}
	
	
	public static boolean CheckFormat(String datePattern, String date) {
		
		Pattern pattern = Pattern.compile(datePattern);
		Matcher matcher = pattern.matcher(date);
		return matcher.matches();
	}
	
	public static void ParseDate(String OldDatePattern, String NewDatePattern, String date) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(OldDatePattern);
		Date dateParse = simpleDateFormat.parse(date);
		System.out.println(new SimpleDateFormat(NewDatePattern).format(dateParse));
	}
	
	public static void showResult(boolean b) {
		if (b== true) 
		{
			System.out.println("Верный формат даты!");
		}

	}
	
	
	
}