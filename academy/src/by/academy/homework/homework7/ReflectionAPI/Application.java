package by.academy.homework.homework7.ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

	public static void main(String[] args) {

		Class<User> user = User.class;

		System.out.println("------------GET METHOD------------");

		try {

			Method getUserInfo = user.getMethod("printUserInfo");
			System.out.println(getUserInfo.getName());

			Method password = user.getMethod("getPassword");
			System.out.println(password.getName());

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println("\n------------GET METHODS------------");

		Method[] methods = user.getMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}

		System.out.println("\n------------GET FIELD------------");

		try {

			Field getLogin = user.getField("login");
			System.out.println(getLogin.getName());

			Field getFirstName = user.getField("firstName");
			System.out.println(getFirstName.getName());

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		System.out.println("\n------------GET FIELDS------------");

		Field[] fields = user.getFields();

		for (Field field : fields) {
			System.out.println(field.getName());
		}

		System.out.println("------------GET DECLARED METHOD------------");

		try {

			Method getUserInfo = user.getDeclaredMethod("printUserInfo");
			System.out.println(getUserInfo.getName());

			Method email = user.getDeclaredMethod("getEmail");
			System.out.println(email.getName());

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		System.out.println("\n------------GET DECLARED METHODS------------");

		Method[] declaredMethods = user.getDeclaredMethods();

		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}

		System.out.println("\n------------GET DECLARED FIELD------------");

		try {

			Field getLogin = user.getDeclaredField("password");
			System.out.println(getLogin.getName());

			Field getFirstName = user.getDeclaredField("email");
			System.out.println(getFirstName.getName());

		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

		System.out.println("\n------------GET DECLARED FIELDS------------");

		Field[] declaredFields = user.getDeclaredFields();

		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}

		System.out.println("\n------------SET AND GET FIELDS------------");
		
		User testUser = new User();
		
		try {
			
			Field getPassword = user.getDeclaredField("password");
			Field getLogin = user.getDeclaredField("login");
			Field getEmail = user.getDeclaredField("email");

			getPassword.setAccessible(true);
			getPassword.set(testUser, "qwerty");
			System.out.println("Password: " + getPassword.get(testUser));

			getLogin.set(testUser, "FromZoo");
			System.out.println("Login: " + getLogin.get(testUser));

			getEmail.setAccessible(true);
			getEmail.set(testUser, "korona@2020.by");
			System.out.println("Email: " + getEmail.get(testUser));

		} catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n------------TOSTRING WITH INVOKE------------");
		
		try {
		       Method method = user.getDeclaredMethod("toString");
		       method.setAccessible(true);

		       System.out.println(method.invoke(testUser));
		   } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
		       e.printStackTrace();
		   }

	}

}
