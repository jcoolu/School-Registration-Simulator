/**
 * Houses the properties of a college course, 
 * allowing them to be accessed in other classes, 
 * mutated , and compared with eachother for 
 * 
 * @author Kirby
 *
 */
public class Course {
	
	private String courseName;
	private String courseCode;
	private int credits;
	private int courseCapacity;
	/**
	 * @param aCourseName 	Name of the course.
	 * @param aCourseCode 	Code specific to that course
	 * @param aCredits		Amount of credits this course gives
	 * @param aCapacity		Total student capacity of this course
	 */
	public Course(String aCourseName, String aCourseCode, 
			int aCredits, int aCapacity){
		courseName = 	 aCourseName;
		courseCode = 	 aCourseCode;
		credits = 		 aCredits;
		courseCapacity = aCapacity;
	}
	/**
	 * Empty constructor
	 */
	public Course(){
		courseName = 	 null;
		courseCode = 	 null;
		credits = 		 -1;
		courseCapacity = -1;
	}
	/**
	 * @return courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	/**
	 * @return credits
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @return courseCapacity
	 */
	public int getCourseCapacity() {
		return courseCapacity;
	}
	/**
	 * @param courseCapacity
	 */
	public void setCourseCapacity(int courseCapacity) {
		this.courseCapacity = courseCapacity;
	}
	/**
	 * @return string of course seperated by commas
	 */
	@Override
	public String toString() {
		return 	courseName 	+ "," + 
				courseCode 	+ "," +
				credits 	+ "," +
				courseCapacity + "," + "\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseCapacity;
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + credits;
		return result;
	}
	/**
	 * Generates equals based on hashcode
	 */
	@Override
	public boolean equals(Object other) {
		if(other == null)
			return false;
		return other.hashCode() == this.hashCode();
	}
}

