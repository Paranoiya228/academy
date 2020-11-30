package by.academy.classwork.lesson11;

public class MainUser {
	
	public static void main(String[] argc)
	{
		User user = new User("Username", "123456");
//		user.createQuery();
		
		
		User.Query query = user.new Query();
		query.printToLog();
		
//		Query q1 = user.new.Query();
	}
	
	
}
