package inheritancehomework;

public class Student extends User {
	
	String studentNo;
	String registeredCourse;
	String finishedCourseNo;
	
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getRegisteredCourse() {
		return registeredCourse;
	}
	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}
	public String getFinishedCourseNo() {
		return finishedCourseNo;
	}
	public void setFinishedCourseNo(String finishedCourseNo) {
		this.finishedCourseNo = finishedCourseNo;
	}

}
