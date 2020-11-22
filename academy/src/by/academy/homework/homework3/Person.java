package by.academy.homework.homework3;

public class Person {

	String name;
	double cash;
	String dateOfBirth;
	String phone;
	String email;

	public Person() {
		super();
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public double getCash() {
		return cash;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
