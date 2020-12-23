package by.academy.homework.homework6;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
//В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
//Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
//Назовите файл Имя_Фамилия.txt. 
//Сериализуйте информацию о пользователе и положите в файл пользователя. Не забываем закрывать потоки. 
//В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)

public class Task3 {
	public static void main(String[] argc) {

		final String adr = "C://users_test";

		List<User> users = new ArrayList<>();

		users.add(new User("Petya", "Petrov", 15));
		users.add(new User("Vanya", "Ivanov", 17));
		users.add(new User("Vasya", "Vasilev", 13));
		users.add(new User("Anna", "Pavlova", 18));
		users.add(new User("Anton", "Antonov", 15));
		users.add(new User("Nastya", "Petrova", 20));
		users.add(new User("Katya", "Pavlova", 12));
		users.add(new User("Irina", "Antonova", 16));
		users.add(new User("Vasiliy", "Pirogov", 21));
		users.add(new User("Kostya", "Kiselev", 14));

		File direct = new File(adr);

		if (!direct.exists()) {
			direct.mkdir();
		}

		for (User user : users) {
			File fileOfUser = new File(direct, user.name + "_" + user.surname + ".txt");

			try (FileOutputStream outputStream = new FileOutputStream(fileOfUser);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

				objectOutputStream.writeObject(user);

			} catch (Exception e) {

				System.err.println(e.getMessage());
			}

		}
		

	}
}