/**
 * Houses the properties of a college course, allowing them to be accessed and mutated
 * @author Kirby
 *
 */
// Hey bro!!
public class Course {
	
	private String courseName;
	private String department;
	private String courseNumber;
	private String credits;
	private String courseCapacity;
	static String [] departmentList = {"ENGL", "MATH", "SCI", "HIST", "CSCI", "MUS"}; 

	public Course(String aCourseName, String aDepartment, String aCourseNumber, 
			String aCredits, String aCapacity){
		courseName = aCourseName;
		department = aDepartment;
		courseNumber = aCourseNumber;
		credits = aCredits;
		courseCapacity = aCapacity;
	}
	public Course(){
		courseName = null;
		department = null;
		courseNumber = null;
		credits = null;
		courseCapacity = null;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getCourseCapacity() {
		return courseCapacity;
	}
	public void setCourseCapacity(String courseCapacity) {
		this.courseCapacity = courseCapacity;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "\n, department=" + department + "\n, courseNumber=" + courseNumber
				+ "\n, credits=" + credits + "\n, courseCapacity=" + courseCapacity + "]";
	}
}

	
