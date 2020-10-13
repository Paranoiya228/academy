package by.academy.homework.homework1;

public class Application {
	public static void main(String...args) {
		Cat cat1= new Cat();
		cat1.nickname = "Мarsik";
		System.out.println("Имя первого кота:" + cat1.nickname);
		cat1.eat();
		cat1.sleep();
		cat1.walk();
		
		Cat cat2 = new Cat();
		cat2.age=5;
		for (int i = 0; i < 3; i++)
		{
			cat2.grow();
			System.out.println("Возраст второго кота:" + cat2.getAge());
		}
		
		cat1.setMoney(50);
		cat2.setMoney(30);
		System.out.println(cat1.getMoney()+cat2.getMoney());
		
		cat1.getInitials();
		
		cat1.IsHomeAnimal(cat1.setIsHomeAnimal());
		}	
}