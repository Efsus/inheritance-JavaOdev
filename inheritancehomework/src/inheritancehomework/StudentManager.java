package inheritancehomework;


public class StudentManager extends UserManager {
	
	public void rateInstructor(Instructor instructor) {
		
		System.out.println("Instructor " + instructor.getFirstName() + " rated.");
		
	}
	
}
