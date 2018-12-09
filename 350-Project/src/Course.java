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
	private String credits;
	private String courseCapacity;
	/**
	 * @param aCourseName 	Name of the course.
	 * @param aCourseCode 	Code specific to that course
	 * @param aCredits		Amount of credits this course gives
	 * @param aCapacity		Total student capacity of this course
	 */
	public Course(String aCourseName, String aCourseCode, 
			String aCredits, String aCapacity){
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
		credits = 		 null;
		courseCapacity = null;
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
	public String getCredits() {
		return credits;
	}
	/**
	 * @param credits
	 */
	public void setCredits(String credits) {
		this.credits = credits;
	}
	/**
	 * @return courseCapacity
	 */
	public String getCourseCapacity() {
		return courseCapacity;
	}
	/**
	 * @param courseCapacity
	 */
	public void setCourseCapacity(String courseCapacity) {
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
		result = prime * result + ((courseCapacity == null) ? 0 : courseCapacity.hashCode());
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (this == obj)
			result = true;
		if (obj == null)
			result = false;
		if (obj.hashCode() == this.hashCode())
			result = true;
		return result;
	}
}

