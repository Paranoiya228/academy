package by.academy.homework.homework4.Date;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import by.academy.homework.homework4.Date.Datte.Year;

public class DateDemo {

	public static void main(String[] argc) throws ParseException {

		Datte date = new Datte();
		date = date.createDate();

		System.out.println("Введите 2 даты dd-MM-yyyy:");
		String dt = Datte.inputLine();
		String dt2 = Datte.inputLine();

		String pattern = "\\d{2}\\-\\d{2}\\-\\d{4}";

		boolean result1 = dt.matches(pattern);
		boolean result2 = dt2.matches(pattern);

		if (result1 == false || result2 == false) {
			System.out.println("Вы ввели дату неверного формата!");
			return;
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(dt, formatter);
		LocalDate date2 = LocalDate.parse(dt2, formatter);

		int year = date1.getYear();

		System.out.println("Между датами " + ChronoUnit.DAYS.between(date1, date2) + " дней.");

		System.out.println("Год: " + year + (Year.isLeapYear(year) == true ? " високосный." : "не високосный."));

	}

}
