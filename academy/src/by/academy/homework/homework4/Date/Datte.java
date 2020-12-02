package by.academy.homework.homework4.Date;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datte {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public Datte() {
		super();
	}

	class Day {
		int value;

	}

	class Month {
		int value;
	}

	static class Year {
		int value;

		static boolean isLeapYear(int year) {

			if (year % 4 == 0) {

				if (year % 100 != 0 || year % 400 == 0) {
					return true;
				}
			}
			return false;
		}
	}

	public Datte createDate() {

		Datte date = new Datte();

		Datte.Day day = new Datte.Day();

		System.out.print("Введите день: ");
		day.value = inputInt();
		this.day = day.value;

		Datte.Month month = new Datte.Month();

		System.out.print("Введите месяц: ");
		month.value = inputInt();
		this.month = month.value;

		Datte.Year year = new Datte.Year();

		System.out.print("Введите год: ");
		year.value = inputInt();
		this.year = year.value;

		return date;

	}

	public String DayOfWeek() throws ParseException {

		String dayOfTheWeek = null;

		int year = getYear();
		int month = getMonth();
		int day = getDay();

		GregorianCalendar cal = new GregorianCalendar(year, month, day);
		int num = cal.get(Calendar.DAY_OF_WEEK);

		switch (num) {
		case 1:
			dayOfTheWeek = "Monday";
			break;
		case 2:
			dayOfTheWeek = "Tuesday";
			break;
		case 3:
			dayOfTheWeek = "Wednesday";
			break;
		case 4:
			dayOfTheWeek = "Thursday";
			break;
		case 5:
			dayOfTheWeek = "Friday";
			break;
		case 6:
			dayOfTheWeek = "Saturday";
			break;
		case 7:
			dayOfTheWeek = "Sunday";
			break;
		}
		return dayOfTheWeek;
	}

	public static int inputInt() {

		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	public static String inputLine() {

		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
