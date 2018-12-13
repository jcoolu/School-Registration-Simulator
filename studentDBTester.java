
/**
 * Write a description of class studentDBTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;

public class studentDBTester
{
    public static void main(String [] args) throws IOException{
		studentDatabase studentDataBase = studentDatabase.getStudents();
		
		/*Create Arraylist from given text file*/
		studentDataBase.createArrayList("StudentDatabase.txt");
		/*Creates the file from the given arraylist*/
		studentDataBase.createFile("StudentDatabase.txt");

	}
    }

   
    

