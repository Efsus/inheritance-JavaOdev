package inheritancehomework;

public class UserManager {
	
	public void register(User user) {
		
		System.out.println("User "+ user.getFirstName() + " added.");
		
	}
	
	public void logIn(User user) {
		System.out.println("Successfully logined.Welcome " + user.getFirstName());
	}

}
