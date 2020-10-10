package by.academy.classwork.lesson1;

public class Cat {
	double money;
	int age;
	String nickname;
	
	public Cat() {  //����������� �� ���������(����� ����), ��������� ���������� ��������
		
	}
	public Cat(String nickname) {
		this.nickname=nickname;
	}
	public Cat(String nickname, int aage) {
		this.nickname=nickname;
		this.age=aage;
	}
	
	public void grow(int addAge) {
		age=age+addAge;
	}
	public void sleep() {
		System.out.println("��� ����");
	}
	public void eat() {
		System.out.println("��� ����");
	}
	public void walk() {
		System.out.println("��� ������");
	}
	public int getAge()
	{
		return age;
	}
	
	public void setMoney(double money)
	{
		this.money=money;
	}
	public double getMoney()
	{
		return money;
	}
	
}
