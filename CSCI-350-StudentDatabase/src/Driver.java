import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Driver 
{
	private static JFrame w;
	public static void main(String[] args) 
	{
		StudentDatabase myStudentDB = new StudentDatabase();
		//CourseDatabase myCourseDB = new CourseDatabase();
		
		w = new JFrame();
		w.setTitle("Login");
		w.setMinimumSize(new Dimension (500, 350));
		LoginPanel myLoginPanel = new LoginPanel();
		w.add(myLoginPanel);
		
		System.out.println("\n\n");
		
		System.out.println(myStudentDB.getFirstNameArray().toString());
		
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.pack();
		w.setVisible(true);		
	}
	
	public static JFrame getJFrame()
	{
		return w;
	}

}
