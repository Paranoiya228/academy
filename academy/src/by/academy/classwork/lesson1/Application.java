package by.academy.classwork.lesson1;

public class Application {
	public static void main(String...args) {
		Cat cat1= new Cat();
		cat1.nickname = "Barsik";
		System.out.println("Имя первого кота:" + cat1.nickname);
		cat1.eat();
		cat1.sleep();
		cat1.walk();
		
		Cat cat2 = new Cat();
		for (int i = 0; i < 3; i++)
		{
			cat2.grow(3);
			System.out.println("Возраст второго кота:" + cat2.age);
		}
		
		Cat cat3 = new Cat("Vasya", 3);
		System.out.println("Имя третьего кота:" + cat3.nickname);
		System.out.println("Его возраст:" + cat3.age);
		
		System.out.println(cat3.getAge());
		
		cat1.setMoney(50);
		cat2.setMoney(30);
		System.out.println(cat1.getMoney()+cat2.getMoney());
		}
		
}
