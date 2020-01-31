
/**
 * 
 * This class controls a database of student objects
 * It is responsible for creating an Arraylist from 
 * a text file containing the data of Student objects
 * It is also responsible for writing newly created
 * Student objects back to the text file.
 * @author (Kirby
 *          Jamie
 *          Ellis)
 * @version (v1)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StudentDatabase {

	private static StudentDatabase dataBase = new StudentDatabase();
	private static ArrayList<Student> studentDB;
	static ArrayList<Course> courses;

	private StudentDatabase() {
		// Initialize instance variables
		studentDB = new ArrayList<Student>();
	}

	/**
	 * getStudents ---- Returns studentDatabase (ArrayList of students)
	 * 
	 * @return database
	 */

	public static StudentDatabase getStudents() {
		return dataBase;
	}

	public static ArrayList<Course> getCourses() {
		return courses;
	}

	public Course getCourse(int i) {
		return courses.get(i);
	}

	public Student getStudent(int i) {
		return studentDB.get(i);
	}

	public int getSize() {
		return studentDB.size();
	}

	public ArrayList<Student> getStudentDB() {
		return studentDB;
	}

	public void addCourse(Course e) {
		courses.add(e);
	}

	/**
	 * @param file
	 *            The text file containing the database
	 * @return ArrayList containing data from .txt file
	 * @throws FileNotFoundException
	 */

	public static ArrayList<Student> createArrayList() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("studentDatabase.txt"));
		scan.useDelimiter(",");

		while (scan.hasNext()) {
			String id = scan.next();
			String firstName = scan.next();
			String lastName = scan.next();
			String address = scan.next();
			String city = scan.next();
			String state = scan.next();
			String zip = scan.next();
			String number = scan.next();
			String major = scan.next();
			String minor = scan.next();
			String gpa = scan.next();
			String studentPhoto = scan.next();
			String numberCourse = scan.next();
			courses = new ArrayList<Course>();
System.out.println(id);
			for (int i = 0; i < Integer.parseInt(numberCourse); i++) {
				courses.add(new Course(scan.next(), scan.next(), scan.next(), scan.next()));
			}

			String credits = scan.next();

			studentDB.add(new Student(id, firstName, lastName, address, city, state, zip, number, major, minor, gpa,
					studentPhoto, numberCourse, courses, credits));
		}
		scan.close();

		return studentDB;

	}

	/**
	 * @param file
	 *            The text file containing the database
	 * @param studentDB
	 *            The ArrayList containing data from .txt file originally
	 * @throws IOException
	 */

	public void createFile() throws IOException {
		FileWriter writer = new FileWriter("studentDatabase.txt", false);
		int size = studentDB.size();
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				writer.write(studentDB.get(i).toString());
				break;
			}
			String str = studentDB.get(i).toString() + ",";
			writer.write(str);
		}
		writer.close();
	}
}