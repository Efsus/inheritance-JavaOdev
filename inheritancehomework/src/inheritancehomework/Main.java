package inheritancehomework;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Yusuf");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setInstructorRating(5);
		
		
		
		
		UserManager userManager = new UserManager();
		userManager.register(user1);
		userManager.logIn(user1);
		userManager.logIn(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.rateInstructor(instructor1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.uploadCourse();
		
		
		
		
	}

}
