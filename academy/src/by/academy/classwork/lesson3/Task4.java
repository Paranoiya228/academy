package by.academy.classwork.lesson3;

public class Task4 {
	public static void main(String[] args) { //8 недель 6 дней 18 часов 23 минуты 20 секунд
		int s = 5423000;
		int sec;
		int m;
		int min, h, day,week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		day =h/24;
		week = day/7;
		System.out.println(h + " часов " + min + " минут " + sec + " секунд");
		System.out.println(day + " дней " + week + " недель ");
	}

}
