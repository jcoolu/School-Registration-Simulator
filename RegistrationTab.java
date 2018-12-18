
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;


public class RegistrationTab extends JPanel 
{
	/**
	 * Constructor that includes GUI with the following method calls:
	 * addCourse
	 * showAllCourses
	 * 
	 */
	private StudentDatabase data;
	private Student student;
	private StudentDatabase stdb;
	
	public RegistrationTab() 
	{
	
		 JPanel panel = new JPanel();
		 JPanel panel2 = new JPanel();
		 JLabel label = new JLabel("Available Courses");
		 JLabel label2 = new JLabel();
		 
		 JTextField field = new JTextField("Enter the course name ",25);
		
		 JTextArea tArea = new JTextArea(15,30);
		 
		 JScrollPane scpanel = new JScrollPane(tArea);
		 scpanel.setBounds(5, 5, 300, 200);
		 
		 JButton addCourse = new JButton("Add course");
		 JButton showCourses = new JButton("Show courses");
		 		
		 //add(BorderLayout.NORTH,panel);
		 panel.add(label,BorderLayout.BEFORE_FIRST_LINE);
		 panel.add(scpanel);
		 add(BorderLayout.NORTH,panel);
		 
		
		 /**
	      * Shows all of the available courses by clicking showCourses.
		  */
		 //panel.add(showCourses);
		 
		 //showCourses.addActionListener(new ActionListener()
		 //{
	      //public void actionPerformed(ActionEvent event)
	      //{
	    	  
	    	  
	    	String line = "";
	  		
	  		Scanner file = null;
	  		
	  	try {
	  		file = new Scanner(new FileReader("courseDatabase.TXT"));
	  		while(file.hasNext()) {
	  			
	  			line = file.nextLine();
	  			tArea.append(line + "\n");
	  			
	  			
	  			
	  		}
	  		file.close();
	  	}
	  	
	  	catch(FileNotFoundException e)
	  	{
	  		String file1 = "File does not exist";
			field.setText(file1);
	  	}
	    	  
	      //}
		 //});
		 
		 
		
		 
		 /**
		  * Part that deals with the south
		  * Adds a course
		  */
	      
		 add(BorderLayout.SOUTH,panel2);
		 panel2.add(addCourse);
		 panel2.add(field);
		 
		 
	   
		 
		 addCourse.addActionListener(new ActionListener()
				 {
			      public void actionPerformed(ActionEvent event)
			      {
			    	  String input = field.getText();
			    	  Scanner scan = new Scanner(input);
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			      }
				 });
				 
				 
				 }
}
		 
		 	
		
		
	
	
	
	
	

