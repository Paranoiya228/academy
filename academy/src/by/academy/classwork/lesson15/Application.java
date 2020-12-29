package by.academy.classwork.lesson15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

	public static void main(String[] args) {
		Class<Cat> clz = Cat.class;

		Field[] dfields = clz.getDeclaredFields();
		System.out.println("\nDECLARED FIELDS:");
		for (Field field : dfields) {
			System.out.println(field.getName());
		}

		Field[] fields = clz.getFields();
		System.out.println("\nFIELDS:");
		for (Field fieldC : fields) {
			System.out.println(fieldC.getName());
		}

		Method[] methods = clz.getDeclaredMethods();
		System.out.println("\nDECLARED METHODS CAT:");
		for (Method dmethod : methods) {
			System.out.println(dmethod.getName());
		}

		Method[] method = clz.getMethods();
		System.out.println("\nMETHODS CAT:");
		for (Method methodC : method) {
			System.out.println(methodC.getName());
		}

		Class<Tiger> clzT = Tiger.class;

		Field[] fieldsT = clzT.getDeclaredFields();
		System.out.println("\nTIGER DECLARED FIELDS:");
		for (Field fieldTT : fieldsT) {
			System.out.println(fieldTT.getName());
		}

		Method[] methodT = clzT.getMethods();
		System.out.println("\nTIGER METHODS:");
		for (Method methodt : methodT) {
			System.out.println(methodt.getName());
		}

		Method[] methodTT = clzT.getMethods();
		System.out.println("\nDECLARED TIGER METHODS:");
		for (Method methodtt : methodTT) {
			System.out.println(methodtt.getName());
		}

		try {
			Tiger tiger = new Tiger();
			Method mRun = clzT.getDeclaredMethod("run");
			mRun.setAccessible(true);
			mRun.invoke(tiger);
			Zoo zoo = mRun.getAnnotation(Zoo.class);
			System.out.println("\n" + zoo.number());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
