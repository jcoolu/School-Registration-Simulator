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
	private static StudentDatabase db = StudentDatabase.getStudents();
	private static JTextField field;
	private static int studentNumber;
	private static JTextArea schedule = new JTextArea(db.getStudent(studentNumber).getScheduleToString());

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
		label.setOpaque(false);
		label.setFont(titleBuilding);
		field = new JTextField("Enter the course name ", 25);
		field.setToolTipText("Enter course name. EX: CSCI 211");
		field.setFont(titleBuilding);

		@SuppressWarnings({ "unchecked", "rawtypes" })
		JList list = new JList(CourseDatabase.getAllCourses().toArray());
		list.setFont(titleBuilding);
		list.setOpaque(false);

		JScrollPane scpanel = new JScrollPane(list);
		scpanel.setOpaque(false);
		scpanel.setBounds(5, 5, 300, 300);

		JButton addCourse = new JButton("Add course");

		// add(BorderLayout.NORTH,panel);
		panel.add(label, BorderLayout.BEFORE_FIRST_LINE);
		panel.add(scpanel);
		panel.setOpaque(false);
		add(BorderLayout.NORTH, panel);

		/*
		 * Part that deals with the south Adding components to the panel.
		 */
		addCourse.addActionListener(addingCourse());
		add(BorderLayout.SOUTH, panel2);
		panel2.add(addCourse);
		panel2.add(field);
		panel2.setOpaque(false);

		add(addCourse);

		JPanel panel3 = new JPanel();
		JLabel label2 = new JLabel("My Schedule:");
		label2.setOpaque(false);
		label2.setFont(titleBuilding);

		schedule.setText(db.getStudent(studentNumber).getScheduleToString());
		schedule.setFont(titleBuilding);
		schedule.setEditable(false);
		panel3.add(label2);
		panel3.add(schedule);
		panel3.setOpaque(false);

		add(panel3, BorderLayout.SOUTH);
	}

	/**
	 * Reading and adding a course to the specific ID Action gets completed by a
	 * button (addCourse) with an action listener
	 */
	public static ActionListener addingCourse() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = field.getText(); // gets text from TextField
				String userInput = JOptionPane
						.showInputDialog("Are you sure you would like to add this course?--(Yes/No)\n" + input);

				// if userInput equals yes, try to add course to Student's
				// schedule
				if (userInput.equalsIgnoreCase("yes")
						&& Integer.parseInt(db.getStudent(studentNumber).getNumberOfCourses()) < 4) {

					for (int i = 0; i < CourseDatabase.getNumOfCourses(); i++) {
						if (CourseDatabase.getCourse(i).getCourseName().trim().equalsIgnoreCase(input.trim())) {
							boolean result = db.getStudent(studentNumber).isAlreadyAdded(input.trim());

							if (result == false) {
								db.getStudent(studentNumber).addCourse(CourseDatabase.getCourse(i));
								int size = Integer.parseInt(db.getStudent(studentNumber).getNumberOfCourses());
								size = size + 1;
								db.getStudent(studentNumber).setnumberOfCourses(Integer.toString(size));
								try {
									db.createFile();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								schedule.setText((db.getStudent(studentNumber).getScheduleToString()));
								JOptionPane.showMessageDialog(Driver.getJFrame(), "Added Course to Schedule.");
								break;
							} else {
								JOptionPane.showMessageDialog(Driver.getJFrame(), "Course already in Schedule.");
								break;
							}
						}
					}
				}

				// if Student's input was no, or Student is trying to add more
				// than four classes
				else {
					if (Integer.parseInt(db.getStudent(studentNumber).getNumberOfCourses()) >= 4) {
						JOptionPane.showMessageDialog(Driver.getJFrame(),
								"Canceled Adding Course to Schedule.\nStudent may have more than four courses in schedule.");
					} else {
						JOptionPane.showMessageDialog(Driver.getJFrame(), "Canceled Adding Course to Schedule.");
					}
				}
			}
		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void paintComponent(Graphics g) {
		Image background = new ImageIcon("addCourse.png").getImage();
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
	}

}// end of class