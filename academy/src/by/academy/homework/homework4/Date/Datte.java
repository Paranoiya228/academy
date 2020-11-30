package by.academy.homework.homework4.Date;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datte {

	private int day;
	private int month;
	private int year;
	String date;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Datte() {
		super();
	}

	public Datte(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Datte(String date) {
		super();
		this.date = date;
	}



	public static class Day {

	}

	public static class Month {

	}

	public static class Year {

		public boolean isLeapYear(int year) {

			if (year % 4 == 0) {
				return true;
			}
			if (year % 100 == 0) {
				return false;
			}
			if (year % 400 == 0) {
				return true;
			}
			return false;
		}

	}
	
	public void isValid() {

		String strPattern = "^[0-9]{2}-[0-9]{2}-[0-9]{4}$";
		Pattern pattern = Pattern.compile(strPattern);
		Matcher matcher = pattern.matcher(getDate());

		System.out.println("The date is " + (matcher.matches() == true ? "valid" : "invalid"));
	}

	public Datte createDate() {

		System.out.println("Введите день: ");
		int day = inputInt();

		System.out.println("Введите месяц: ");
		int month = inputInt();

		System.out.println("Введите год: ");
		int year = inputInt();

		Datte date = new Datte(day, month, year);
		return date;

	}

	public void DayOfWeek() throws ParseException {

		int year = getYear();
		int month = getMonth();
		int day = getDay();

		LocalDate date = LocalDate.of(year, month, day);

		DayOfWeek dayOfWeek = date.getDayOfWeek();

		System.out.println(date);
		System.out.println(dayOfWeek);
	}

	public int inputInt() {

		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	public String inpuLine() {

		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
