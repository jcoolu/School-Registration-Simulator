
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
	     
		/**
		  * Creating and initializing the ideal components for the Registering Class
		  */
		 JPanel panel = new JPanel();
		 JPanel panel2 = new JPanel();
		 JLabel label = new JLabel("Available Courses");
		 
		 JTextField field = new JTextField("Enter the course name ",25);
		
		 JTextArea tArea = new JTextArea(15,30);
		 
		 JScrollPane scpanel = new JScrollPane(tArea);
		 scpanel.setBounds(5, 5, 300, 200);
		 
		 JButton addCourse = new JButton("Add course");
		 //JButton showCourses = new JButton("Show courses");
		 		
		 //add(BorderLayout.NORTH,panel);
		 panel.add(label,BorderLayout.BEFORE_FIRST_LINE);
		 panel.add(scpanel);
		 add(BorderLayout.NORTH,panel);
		 
		
		 /**
	      * Shows all of the available courses by just going into the tab.
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
		  * Adding components to the panel.
		  */
	      
		 add(BorderLayout.SOUTH,panel2);
		 panel2.add(addCourse);
		 panel2.add(field);
		 
		 
	   
		 /**
		  * Reading and adding a course to the specific ID
		  * Action gets completed by a button (addCourse) witn an action listener
		  */
		 addCourse.addActionListener(new ActionListener()
				 {
			      public void actionPerformed(ActionEvent event)
			      {
			    	  String input = field.getText();
			    	  //Scanner scan = new Scanner(input);
			    	  
			    	  /**
			 		  * Variables for getting the id's per line in the student Database
			 		  * Happpens in this first try block.
			 		  */
			    	  Scanner scan;
			    	  String id1 =null, id2=null, id3=null, id4=null, id5=null, id6=null;
			    	  
			    	  try {
			    		  FileReader dataReader = new FileReader("studentDatabase.TXT");
			    		  scan = new Scanner(dataReader);
			    		  
			    		  while(scan.hasNext()){
			    			  //Student IDs
			    			 id1 = scan.next()+ "\n";
			    			 id2 = scan.next()+ "\n";
			    			 id3 = scan.next()+ "\n";
			    			 id4 = scan.next()+ "\n";
			    			 id5 = scan.next()+ "\n";
			    			 id6 = scan.next()+ "\n";
			    			 
			    			  
			    		  }
			    		  dataReader.close();
			    		  
			    	  }// end of try
			    	  
			    	  catch(IOException e)
			    	  {
			    		String fieldText = "File not found";
			    		field.setText(fieldText);
			    		    
			    	  }
			    	  
			    	  /**
				 		  * Variables for getting the id's per line in the student Database (txt file)
				 		  * Compares the first six ID's with the one in the student Database with
				 		  * the one in the student course database (txt file)
				 		  * These actions happen in a second try block.
				 		  */
			    	  Scanner scan2;
			    	  String id7 =null, id8=null, id9=null, id10=null, id11=null, id12=null;
			    	  try
			    	  {
			    		 PrintWriter dataWriter = new PrintWriter("studentCourseDatabase.TXT");
			    		 scan2 = new Scanner((Readable) dataWriter);
			    		 
			    		 while(scan2.hasNext())
			    			 
			    		 {
			    			 //Student ID's
			    			 id7 = scan2.next()+ "\n";
			    			 id8 = scan2.next()+ "\n";
			    			 id9 = scan2.next()+ "\n";
			    			 id10 = scan2.next()+ "\n";
			    			 id11 = scan2.next()+ "\n";
			    			 id12 = scan2.next()+ "\n";	
			    			 
			    		 }
			    		 
			    		 if (id1.equals(id7)) 
			    		 {
			    			 dataWriter.write(input);
			    			 
			    		 }
			    		 
			    		 else if (id2.equals(id8)) 
			    		 
			    		 {
			    			 dataWriter.write(input);
			    		 }
			    		 
			    		 else if (id3.equals(id9)) 
			    		 
			    		 {
			    			 dataWriter.write(input);
			    			 
			    		 }
			    		 
			    		 else if (id4.equals(id10)) 
			    		 
			    		 {
			    			 dataWriter.write(input);
			    		 }
			    		 
			    		 else if (id5.equals(id11)) 
			    		 
			    		 {
			    			 dataWriter.write(input);
			    			 
			    		 }
			    		 
			    		 else if (id6.equals(id12)) 
			    		 
			    		 {
			    			 dataWriter.write(input);
			    		 }
			    		  
			    		 dataWriter.close();
			    		  
			    	  } //end of try
			    	  
			    	  catch(IOException g)
			    	  {
			    		String fieldText = "File not found";
				    	field.setText(fieldText);
			    		  
			    	  }
			    	  
			    	  
			      } // end of action performed (add course)
				 });
				 
				 
				 }// end of constructor
}// end of class
		 
		 	
		
		
	
	
	
	
	

