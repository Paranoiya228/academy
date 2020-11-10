package by.academy.classwork.lesson5;

public class LessonString {

	public static void main(String[] argc)
	{
		String str1 =new String();
		System.out.println("str1:[" + str1 +"]");
		
		char[] chars1 = {'a','b', 'c'};
		String str2 = new String(chars1);
		System.out.println("str2:[" + str2 +"]");
		
		char[] chars2 = {'a','b', 'c','d','e','f'};
		String str3 = new String(chars2,2,3);
		System.out.println("str3:[" + str3 +"]");
		
		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".startsWith("bar"));
		System.out.println("Foobar".contains("oo"));
		
		System.out.println("Hello,World!".regionMatches(6, "oword",1,4));
		//возвращает значение true, если указанная субобласть данной строки соответствует 
		//субобласти указанного строкового аргумента; в противном случае значение false.
		
		String s1="Java String";
		String s="Для работы со строками в языке Java используются классы String,StringBuilder, StringBuffer.";
		System.out.println(s1);
		System.out.println(s1.charAt(3));
		//поиск элемента по индексу
		
		System.out.println(s.indexOf('S'));//поиск индекса по символу
		System.out.println(s.indexOf('S',60));
		
		
		System.out.println("Hello".concat("World"));
		System.out.println("Hello".replace('l','w'));
		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
		
		System.out.println("  Hello World".trim());
		//удаляет пробелы в начале и в конце строки
		
		/*substring(int begin,int end)-поиск подстроки в строке
		join(разделение строк, строки)-объединение строк*/
		
		//StringBuilder
		
		int a =42;
		StringBuilder sb= new StringBuilder(40);
		
		String ss=sb.append("a= ").append(a).append("!").toString();//обновляет состояние буфера
		System.out.println(ss);
		
		
		
		
		
	}
	
}