
import java.io.IOException;
import java.util.ArrayList;

public class CourseDBTester {
	public static void main(String [] args) throws IOException{
		CourseDatabase courseDB = new CourseDatabase();
		ArrayList<Course> courseDBAL = new ArrayList<Course>();

		//Course c12345 = new Course("English 101", "c12345", 4, 200);
		//Course c54321 = new Course("History 400", "c54321", 4, 211);
		
		/*Create Arraylist from given text file*/
		courseDB.createArrayList("CourseDatabase.txt");
		/*Creates the file from the given arraylist*/
		courseDB.createFile("CourseDatabase.txt", courseDBAL);
		
		for(int i=0; i<courseDBAL.size(); i++){
			System.out.print(courseDBAL.get(i));
		}
	}
}
