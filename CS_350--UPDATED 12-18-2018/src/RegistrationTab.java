import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * 
 * @author Jamie
 * @author Oliver
 *
 */
@SuppressWarnings("serial")
public class RegistrationTab extends JPanel implements ActionListener {
	/**
	 * Constructor that includes GUI with the following method calls: addCourse
	 * showAllCourses
	 * 
	 */
	private static StudentDatabase1 db = StudentDatabase1.getStudents();
	private static JTextField field;
	private static int studentNumber;

	public RegistrationTab() {
		try {
			CourseDatabase.createArrayList("courseDatabase.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String student = LoginPanel.getUsername();
		// sets studentNumber so that correct information is displayed
		if (student.equals("jcoulombe_0001")) {
			studentNumber = 1;
		}
		if (student.equals("ofelizlima_0002")) {
			studentNumber = 2;
		}
		if (student.equals("kforsberg_0003")) {
			studentNumber = 3;
		}
		if (student.equals("gcastigleigo_0004")) {
			studentNumber = 4;
		}
		if (student.equals("egarcia_0005")) {
			studentNumber = 5;
		}

		Font titleBuilding = new Font("Palatino Linotype", Font.PLAIN, 18);// creates
																			// font
		/**
		 * Creating and initializing the ideal components for the Registering
		 * Class
		 */
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Available Courses");
		label.setFont(titleBuilding);
		field = new JTextField("Enter the course name ", 25);
		field.setToolTipText("Enter course name. EX: CSCI 211");
		field.setFont(titleBuilding);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		JList list = new JList(CourseDatabase.getAllCourses().toArray());
		list.setFont(titleBuilding);

		JScrollPane scpanel = new JScrollPane(list);
		scpanel.setBounds(5, 5, 300, 300);

		JButton addCourse = new JButton("Add course");

		// add(BorderLayout.NORTH,panel);
		panel.add(label, BorderLayout.BEFORE_FIRST_LINE);
		panel.add(scpanel);
		add(BorderLayout.NORTH, panel);

		/*
		 * Part that deals with the south Adding components to the panel.
		 */
		addCourse.addActionListener(addingCourse());
		add(BorderLayout.SOUTH, panel2);
		panel2.add(addCourse);
		panel2.add(field);

		add(addCourse);
	}

	/**
	 * Reading and adding a course to the specific ID Action gets completed by a
	 * button (addCourse) with an action listener
	 */
	public static ActionListener addingCourse() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = field.getText();
				String userInput = JOptionPane
						.showInputDialog("Are you sure you would like to add this course?--(Yes/No)\n" + input);
				boolean result;
				if (userInput.equalsIgnoreCase("yes")
						&& Integer.parseInt(db.getStudent(studentNumber).getNumberOfCourses()) <= 4) {
					result = true;
				} else {
					result = false;
				}

				if (result = true) {
					for (int i = 0; i < CourseDatabase.getNumOfCourses(); i++) {

						if (CourseDatabase.getCourse(i).getCourseName().trim().equalsIgnoreCase(input.trim())) {

							db.getStudent(studentNumber).addCourse(CourseDatabase.getCourse(i));
							int size = Integer.parseInt(db.getStudent(studentNumber).getNumberOfCourses());
							size = size + 1;
							db.getStudent(studentNumber).setnumberOfCourses(Integer.toString(size));
							break;
						}
					}

					try {
						StudentDatabase1.createFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}// end of class