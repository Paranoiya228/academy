package by.academy.classwork.lesson11;

public class User {

	private String login;
	private String password;
	
	public void createQuery() {
		Query q = new Query();
		q.printToLog();
		
	}

	public class Query {
		public void printToLog() {

			System.out.println("Пользователь с логином " + login + " и паролем " + password + "   отправил запрос.");
		}
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	
	
}
