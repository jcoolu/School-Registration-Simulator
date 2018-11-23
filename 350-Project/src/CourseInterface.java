import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
/**
 * Creates an GUI to house the functions of creating a course
 * @author Kirby
 *
 */
public class CourseInterface extends JFrame  {
	private static final long serialVersionUID = 1469369621708965186L;
	
	JPanel courseNameJP = 		new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel departmentJP = 		new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel courseNumberJP = 	new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel creditsJP = 			new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel courseCapacityJP = 	new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel courseCodeJP = 		new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel[] informationList = {courseNameJP, departmentJP, courseNumberJP, 
			creditsJP, courseCapacityJP, courseCodeJP};
	JPanel buttonPanel = 		new JPanel(new GridLayout(3, 1));
	JPanel newEntryPanel = 		new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel submitPanel = 		new JPanel(new FlowLayout(FlowLayout.CENTER));
	JPanel showPanel =			new JPanel(new FlowLayout(FlowLayout.CENTER));
	final static JTextArea showCourseJTA = new JTextArea(40, 50);
	
	public CourseInterface(){

		this.setSize(550, 650);
		this.setTitle("Course Catalog");
		this.setLocationRelativeTo(null);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setDividerLocation(250);
		JScrollPane scrollText = new JScrollPane(showCourseJTA);
		showCourseJTA.setEditable(false);
		splitPane.setLeftComponent(scrollText);
		this.add(splitPane);
		JPanel contentPanel = new JPanel(new GridLayout(7,1));
		splitPane.setRightComponent(contentPanel);
		
		/*Adds controls to each element*/
		CourseControl.courseNameCTRL(courseNameJP);
		CourseControl.departmentCTRL(departmentJP);
		CourseControl.courseNumberCTRL(courseNumberJP);
		CourseControl.creditCTRL(creditsJP);
		CourseControl.courseCapacityCTRL(courseCapacityJP);
		CourseControl.courseCodeCTRL(courseCodeJP);
		CourseControl.submitCTRL(submitPanel);
		CourseControl.newEntryCTRL(newEntryPanel);
		CourseControl.showAllCTRL(showPanel);
		
		/*ADD ADD ADD MWA HAHAHAHAHAHA*/
		buttonPanel.add(submitPanel);
		buttonPanel.add(newEntryPanel);
		buttonPanel.add(showPanel);
		
		contentPanel.add(courseNameJP);
		contentPanel.add(departmentJP);
		contentPanel.add(courseNumberJP);
		contentPanel.add(creditsJP);
		contentPanel.add(courseCapacityJP);
		contentPanel.add(courseCodeJP);
		contentPanel.add(buttonPanel);

	
	}
}//end of class

//Course c00030 = new Course("English 101", Course.departmentList[0], "101", 4, 30);
//Course c01346 = new Course("Contemporary Topics in Math", Course.departmentList[1], "139", 4, 25);
//Course c04556 = new Course("Algorithmic Thinking in Python", Course.departmentList[4], "127", 4, 20);
//Course c00203 = new Course("Creative Writing", Course.departmentList[0],"230", 4, 30);
//Course c05011 = new Course("Student Recital Series", Course.departmentList[5], "091", 0, 100); 
//Course c02599 = new Course("Chemistry Lab", Course.departmentList[2], "204", 3, 20);
//Course c03007 = new Course("Lecture in America since 1700" , Course.departmentList[3], "107", 4, 200);
