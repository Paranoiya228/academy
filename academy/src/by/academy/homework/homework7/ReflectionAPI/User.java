package by.academy.homework.homework7.ReflectionAPI;

public class User extends Person {

	public String login;
	protected String password;
	private String email;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("Login: " + getLogin());
		System.out.println("Password: " + getPassword());
		System.out.println("Email: " + getEmail());
	}

}
