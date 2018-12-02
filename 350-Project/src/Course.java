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
	
	public Course(){
		courseName = 	 null;
		courseCode = 	 null;
		credits = 		 null;
		courseCapacity = null;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
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
		return "Course \ncourseName=" + courseName + 
				"\n, courseCode=" + courseCode
				+ "\n, credits=" + credits + 
				"\n, courseCapacity=" + courseCapacity;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseCapacity == null) ? 0 : courseCapacity.hashCode());
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
		result = prime * result + ((credits == null) ? 0 : credits.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object other) {

	    if (other == null) {
	        return false;
	    }
	    if (this == other) {
	        return true;
	    }
	    return (this.hashCode() == other.hashCode());
	}


}

