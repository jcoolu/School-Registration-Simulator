import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentDatabase
{
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<String> studentID = new ArrayList<String>(10000);
	private ArrayList<String> firstName = new ArrayList<String>();
	private ArrayList<String> lastName = new ArrayList<String>();
	private ArrayList<String> address = new ArrayList<String>();
	private ArrayList<String> city = new ArrayList<String>();
	private ArrayList<String> state = new ArrayList<String>();
	private ArrayList<String> zipCode = new ArrayList<String>();
	private ArrayList<String> phoneNumber = new ArrayList<String>();
	private ArrayList<String> major = new ArrayList<String>();
	private ArrayList<String> minor = new ArrayList<String>();
	private ArrayList<String> totalCredits = new ArrayList<String>();
	private ArrayList<String> gpa = new ArrayList<String>();
	private ArrayList<String> imageFile = new ArrayList<String>();


	public StudentDatabase ()
	{
		Scanner sc = null;
		String fileName = "studentDatabase.txt";

		try 
		{
			sc = new Scanner (new FileReader (fileName));

			int counter = 0;
			while (sc.hasNextLine())
			{
				String eachLineInFile = sc.nextLine();
				String[] tempArray = new String [13];
				tempArray = eachLineInFile.split(",");

				Student eachStudent = new Student(); // create a student
				studentList.add(eachStudent);        // add the student to the list

				// setting the data of the student
				eachStudent.setId(tempArray[0]);
				eachStudent.setFirstName(tempArray[1]);
				eachStudent.setLastName(tempArray[2]);
				eachStudent.setAddress(tempArray[3]);
				eachStudent.setCity(tempArray[4]);
				eachStudent.setState(tempArray[5]);
				eachStudent.setZip(tempArray[6]);
				eachStudent.setNumber(tempArray[7]);
				eachStudent.setMajor(tempArray[8]);
				eachStudent.setMinor(tempArray[9]);
				eachStudent.setTotalCredits(tempArray[10]);
				eachStudent.setGpa(tempArray[11]);
				eachStudent.setStudentPhoto(tempArray[12]);

				for (int i = 0; i < 10000; i++)
				{
					studentID.add("0000");
				}

				// Filling in the arrays representing all the students
				studentID.set(Integer.parseInt(tempArray[0]), tempArray[0]);
				firstName.add(tempArray[1]);
				lastName.add(tempArray[2]);
				address.add(tempArray[3]);
				city.add(tempArray[4]);
				state.add(tempArray[5]);
				zipCode.add(tempArray[6]);
				phoneNumber.add(tempArray[7]);
				major.add(tempArray[8]);
				minor.add(tempArray[9]);
				totalCredits.add(tempArray[10]);
				gpa.add(tempArray[11]);
				imageFile.add(tempArray[12]); 
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
		}
	}

	public void addStudent()
	{
		Student std = new Student();

		std.setFirstName(AdminStudentTab.fnameTxt.getText());
		std.setLastName(AdminStudentTab.lnameTxt.getText());
		std.setAddress(AdminStudentTab.streetAddressTxt.getText());
		std.setCity(AdminStudentTab.cityTxt.getText());
		std.setState(AdminStudentTab.stateTxt.getText());
		std.setZip(AdminStudentTab.zipcodeTxt.getText());
		std.setNumber(AdminStudentTab.phoneTxt.getText());
		std.setMajor(AdminStudentTab.majorTxt.getText());
		std.setMinor(AdminStudentTab.minorTxt.getText());
		std.setTotalCredits(AdminStudentTab.totalCreditsTxt.getText());
		std.setGpa(AdminStudentTab.gpaTxt.getText());
		std.setStudentPhoto(std.getId()+".png");

		FileWriter fw = null;

		try
		{
			fw = new FileWriter("studentDatabase.txt", true);
			fw.write(std.getFirstName()+","+std.getLastName()+","+std.getAddress()+","+std.getCity()+","+std.getState()+"," + 
					std.getZip()+","+std.getNumber()+","+std.getMajor()+","+std.getMinor()+","+std.getTotalCredits()+","+
					std.getGpa()+","+std.getStudentPhoto());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fw.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}



	public ArrayList<String> getStudentIDArray()
	{
		return studentID;
	}
	public ArrayList<String> getFirstNameArray()
	{
		return firstName;
	}
	public ArrayList<String> getLastNameArray()
	{
		return lastName;
	}
	public ArrayList<String> getAddressArray()
	{
		return address;
	}
	public ArrayList<String> getCityArray()
	{
		return city;
	}

	public ArrayList<String> getStateArray()
	{
		return state;
	}
	public ArrayList<String> getZipCodeArray()
	{
		return zipCode;
	}
	public ArrayList<String> getPhoneNumberArray()
	{
		return phoneNumber;
	}

	public ArrayList<String> getMajorArray()
	{
		return major;
	}

	public ArrayList<String> getMinorArray()
	{
		return minor;
	}

	public ArrayList<String> getTotalCreditsArray()
	{
		return totalCredits;
	}

	public ArrayList<String> getGpaArray()
	{
		return gpa;
	}
	public ArrayList<String> getImageFileArray()
	{
		return imageFile;
	}
	
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}

	public static void main(String[] args) 
	{
		boolean mf = false; 
		Student std = new Student();
		StudentDatabase db = new StudentDatabase();


		int counter = 1;
		while (counter < db.getStudentIDArray().size() && mf == false)
		{

			if (db.getStudentIDArray().get(counter).equals("0000"))
			{

				mf = true;
				std.setId(Integer.toString(counter));
			}

			counter++;

		}



		System.out.println(String.format("%04d", Integer.parseInt(std.getId())));

		//System.out.println(db.getStudentIDArray());
	}
}
