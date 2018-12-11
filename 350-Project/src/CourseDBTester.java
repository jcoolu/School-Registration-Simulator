import java.io.IOException;
 public class CourseDBTester {
	public static void main(String [] args) throws IOException{
		CourseDatabase courseDataBase = CourseDatabase.getCourses();
		
		/*Create Arraylist from given text file*/
		courseDataBase.createArrayList("CourseDatabase.txt");
		/*Creates the file from the given arraylist*/
		courseDataBase.createFile("CourseDatabase.txt");

	}
}