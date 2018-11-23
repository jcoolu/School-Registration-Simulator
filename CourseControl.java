import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 * This class evokes all the actions that each windowing tool will take
 * @author Kirby
 *
 */
public class CourseControl {
	
	final static JTextField courseName 	= new JTextField(15);
	final static JTextField deptName 	= new JTextField(15);
	final static JTextField cnumName 	= new JTextField(4);
	final static JTextField credName 	= new JTextField(3);
	final static JTextField capName 	= new JTextField(4);
	final static JTextField codeName 	= new JTextField(7);
	
	static ArrayList <Course> courseDatabase = new ArrayList<Course>();
	static void courseNameCTRL(JPanel namePanel){
		JLabel cName = new JLabel("      Course Name: ");
		namePanel.add(cName);	
		namePanel.add(courseName);
	}
	
	static void departmentCTRL(JPanel deptPanel){
		JLabel dName = new JLabel("         Department: ");
		deptPanel.add(dName);
		deptPanel.add(deptName);
	}
	
	static void courseNumberCTRL(JPanel cnPanel){
		JLabel cnName = new JLabel("  Course Number: ");
		cnPanel.add(cnName);
		cnPanel.add(cnumName);
		cnumName.addKeyListener(new KeyAdapter() {
		    @Override
			public void keyTyped(KeyEvent e) {
		        if (cnumName.getText().length() >= 3 ) {e.consume();}
		    }
		});
	}
	
	static void creditCTRL(JPanel credPanel){
		JLabel crName = new JLabel("                 Credits: ");
		credPanel.add(crName);
		credPanel.add(credName);
		credName.addKeyListener(new KeyAdapter() {
		    @Override
			public void keyTyped(KeyEvent e) {
		        if (credName.getText().length() >= 2 ) {e.consume();}
		    }
		});
	}
	
	static void courseCapacityCTRL(JPanel capPanel){
		JLabel cpName = new JLabel("Course Capacity: ");
		capPanel.add(cpName);
		capPanel.add(capName);
		capName.addKeyListener(new KeyAdapter() {
		    @Override
			public void keyTyped(KeyEvent e) {
		        if (capName.getText().length() >= 3 ) {e.consume();}
		    }
		});
	}
	
	static void courseCodeCTRL(JPanel codePanel){
		JLabel cdName = new JLabel("      Course Code: ");
		codePanel.add(cdName);
		codeName.addKeyListener(new KeyAdapter() {
	    @Override
    	@SuppressWarnings("unused")
		public void keyTyped(KeyEvent e) {
			char letter = e.getKeyChar();
	        if (codeName.getText().length() >= 7 ) {e.consume();}
	        //else if(((CharSequence) e).charAt(1) != 'c'){//if first letter isn't lowercase 'c'
	        	//e.consume();}
	        /*else if*/ {/*make it so character 1-7 are only numbers*/}
	    	}//end of method keyTypes
		});//end of listener
		codePanel.add(codeName);
	}
	
	static void submitCTRL(JPanel submitPanel){
		JButton submitButton = new JButton("Generate Course Details");
		submitButton.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent evt) {
		        if(SwingUtilities.isLeftMouseButton(evt)){
		    		String courseNameT = 	CourseControl.courseName.getText();
		    		String deptT = 			CourseControl.deptName.getText();
		    		String courseNumT = 	CourseControl.cnumName.getText();
		    		String credT = 			CourseControl.credName.getText();
		    		String courseCapT = 	CourseControl.capName.getText();
		    		String codeNameT = 		CourseControl.codeName.getText();
		        	String fullDetailString = "";
		        	fullDetailString +=  //because i'm too lazy to put string modifiers -_-
		        	"     Course Name  :  " 			+ courseNameT 	+ 
		    	    "\n         Department  :  " 		+ deptT  		+
		    	    "\n Course Number  :  " 			+ courseNumT  	+
		    	    "\n                 Credits  :  " 	+ credT  		+
		    	    "\nCourse Capacity  :  " 			+ courseCapT 	+ 
		    	    "\n      Course Code  :  " 			+ codeNameT;
		        	CourseInterface.showCourseJTA.setText(fullDetailString);
		        }//if
		    }//mouseClicked
		});//end of internal class
		submitPanel.add(submitButton);
	}
	
	static void newEntryCTRL(JPanel newEntryPanel){
		JButton newEntryButton = new JButton("Next Entry");
		newEntryButton.addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent evt) {
	        if(SwingUtilities.isLeftMouseButton(evt)){
	        	CourseControl.courseName.setText("");
	    	    CourseControl.deptName.setText("")	;
	    	    CourseControl.cnumName.setText("")	; 
	    	    CourseControl.credName.setText("")	;
	    	    CourseControl.capName.setText("")	;
	    	    CourseControl.codeName.setText("")	;
	    	    //add control to input next course info
	        	}//if
	    	}//mouseClicked
		});//end of internal class
		newEntryPanel.add(newEntryButton);
	}
	
	static void showAllCTRL(JPanel showPanel){
		JButton showButton = new JButton("Show all");
		showButton.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent evt) {
		        if(SwingUtilities.isLeftMouseButton(evt)){
		    		String courseNameT = 	CourseControl.courseName.getText()	;
		    		String deptT = 			CourseControl.deptName.getText()	;
		    		String courseNumT = 	CourseControl.cnumName.getText()	;
		    		String credT = 			CourseControl.credName.getText()	;
		    		String courseCapT = 	CourseControl.capName.getText()		;
		    		//String codeNameT = 		CourseControl.codeName.getText();
		    		
		        	courseDatabase.add(new Course(courseNameT, deptT, courseNumT, 
		        				credT, courseCapT));
		        	JOptionPane.showMessageDialog(null, courseDatabase.get(0));
		        }//if
		    }//mouseClicked
		});//end of internal class
		showPanel.add(showButton);
	}
}//end of class
