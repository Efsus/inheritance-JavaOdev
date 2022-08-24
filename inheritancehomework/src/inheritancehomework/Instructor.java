package inheritancehomework;

public class Instructor extends User {
	
	private String branch;
	private double instructorRating;
	
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getInstructorRating() {
		return instructorRating;
	}
	public void setInstructorRating(double instructorRating){
		this.instructorRating = instructorRating;
	}
	
	
	
}
