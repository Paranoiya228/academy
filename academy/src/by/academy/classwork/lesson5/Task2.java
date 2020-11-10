package by.academy.classwork.lesson5;

public class Task2 {

	public static void main(String[] args) {
		int a=3,b=56;
		int c1=a+b;
		int c2=a-b;
		int c3=a*b;
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		StringBuilder sb3=new StringBuilder();
		
		String s1=sb1.append(a).append("+").append(b).append("=").append(c1).toString();	
		String s2=sb2.append(a).append("-").append(b).append("=").append(c2).toString();	
		String s3=sb3.append(a).append("*").append(b).append("=").append(c3).toString();	
		
		System.out.println(s1);	
		System.out.println(s2);	
		System.out.println(s3);	
		
		s1=sb1.delete(4,5).toString();
		s1=sb1.insert(4, " равно ").toString();
		
		System.out.println(s1);	
		
		s2=sb2.replace(4, 5, " равно ").toString();
		
		System.out.println(s2);	
		
		

	}

}
