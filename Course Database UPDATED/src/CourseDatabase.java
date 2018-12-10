import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class controls a database of Course objects
 * 
 * It is responsible for creating an Arraylist from 
 * a text file containing the data of Course objects
 * 
 * It is also responsible for writing newly created
 * Course objects back to the text file.
 * Uses singleton design pattern to instantiate object.
 * 
 * @author Kirby
 * 
 */

public class CourseDatabase {
	
	private static CourseDatabase db = new CourseDatabase();
	private ArrayList<Course> courseDB;

	private CourseDatabase(){
		courseDB = new ArrayList<Course>();
	}
	
	/**
	 * getCourses --- Returns CourseDatabase (ArrayList of courses)
	 * @return db
	 */
	public static CourseDatabase getCourses() {
		return db;
	}
	/**
	 * @param file The text file containaing the database
	 * @return ArrayList containing data from .txt file
	 * @throws FileNotFoundException
	 */
	public ArrayList<Course> createArrayList(String file) throws FileNotFoundException{
		
		Scanner scan = new Scanner(new File(file));
		scan.useDelimiter(",");
		
		while(scan.hasNext()){
			String name = scan.next();
			String code = scan.next();
			String credits = scan.next();
			String capacity = scan.next();
			courseDB.add( new Course(name, code, credits, capacity));
		}
		
		scan.close();
		return courseDB;
	}
	
	/**
	 * @param file The text file containing the database
	 * @param courseDB The ArrayList containing data from .txt file originally
	 * @throws IOException
	 */
	public void createFile(String file) throws IOException{
        FileWriter writer = new FileWriter(file);
        int size = courseDB.size();
        
        for (int i=0;i<size;i++) {
        	//if i is on last item, DON'T add "," after item
            if(i == size-1){
                writer.write(courseDB.get(i).toString());
                break;
            }
            //writes each item into file
            String str = courseDB.get(i).toString() + ",";
            writer.write(str);
            
        }
        writer.close();
    }
}
