
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

/**
 * PersonalInfoTab --- This class displays personal info about the student that
 * has logged in. It displays their first name, last name, address, city, state,
 * zipcode, phone #, major, minor, gpa, and student ID. The user can edit their
 * info (not first name, last name, gpa, or student ID.
 * 
 * @author Jamie
 *
 */
@SuppressWarnings("serial")
public class PersonalInfoTab extends JPanel implements ActionListener {
	// Labels for info
	private String[] textFieldLabels = { "\nFirst Name: ", "\nLast Name: ", "Street Address: ", "City: ", "State: ",
			"Zip Code: ", "Phone Number: ", "Major: ", "Minor: ", "GPA: ", "Student ID: " };
	// textfield tool tips for textfields.
	private String[] textFieldsTips = { "Enter First Name.", "Enter Last Name.",
			"Enter Street Address EX: 123 Smith Street ", "Enter City.", "Enter State. (Initials)", "Enter Zip Code.",
			"Enter Phone Number.", "Enter Major(s).", "Enter Minor(s)", "Enter GPA", "Enter Student ID" };
	private static JTextField[] texts; // text fields for personal info
	private static JPanel[] panels; // panels for personal info
	private static int studentNumber; // student # (what student you're showing)
	private static StudentDatabase db = StudentDatabase.getStudents();// references
																		// StudentDatabase
	
	public PersonalInfoTab() {
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

		// Adds panel for each textField
		panels = new JPanel[textFieldLabels.length];
		texts = new JTextField[panels.length];
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		JPanel name = new JPanel(); // name panel
		JPanel location = new JPanel(); // location panel
		JPanel degree = new JPanel(); // degree panel
		JPanel student1 = new JPanel(); // student panel

		// creates welcome title for user
		Font welcomeTitlefont = new Font("Monotype Corsiva", Font.BOLD, 67);
		JPanel title = new JPanel();
		JLabel welcome = new JLabel("Welcome, " + db.getStudent(studentNumber).getFirstName() + " "
				+ db.getStudent(studentNumber).getLastName());
		welcome.setFont(welcomeTitlefont);
		welcome.setForeground(Color.BLACK); // sets font to be black
		title.setOpaque(false);
		title.add(welcome);

		Font labelFont = new Font("Times New Roman", Font.BOLD, 18);
		Font textFieldFont = new Font("Times New Roman", Font.PLAIN, 15);

		// adding text fields
		for (int i = 0; i < textFieldLabels.length; i++) {
			JTextField text = new JTextField(80); // default size for textfield
			texts[i] = text;

			JLabel label; // label for text (font)

			text.setToolTipText(textFieldsTips[i]);
			text.setEditable(false);
			panels[i].setOpaque(false);// makes panels invisible
			panels[i].add(label = new JLabel(textFieldLabels[i]));// adds labels
																	// for each
																	// textfield
			label.setFont(labelFont);

			texts[i].setFont(textFieldFont);

			label.setForeground(Color.BLACK); // sets text color
			panels[i].add(text);// adds text to each panel
			// (for first name and last name)
			if (i == 0 || i == 1) {
				text.setColumns(30);
				name.setOpaque(false);
				name.add(panels[i]);
			}
			// (for city, state, and zipcode)
			if (i == 3 || i == 4 || i == 5) {
				text.setColumns(10);
				location.setOpaque(false);
				location.add(panels[i]);
			}
			// (for phone #, major, and minor)
			if (i == 6 || i == 7 || i == 8) {
				text.setColumns(25);
				degree.setOpaque(false);
				degree.add(panels[i]);
			}
			// (for gpa and student id
			if (i == 9 || i == 10) {
				text.setColumns(15);
				student1.setOpaque(false);
				student1.add(panels[i]);
			}
		}

		add(title, BorderLayout.SOUTH);
		add(name, BorderLayout.SOUTH);
		add(panels[2], BorderLayout.SOUTH);
		add(location, BorderLayout.SOUTH);
		add(degree, BorderLayout.SOUTH);
		add(student1, BorderLayout.SOUTH);

		// sets text for each textfield of student (fills in info accordingly)
		texts[0].setText(db.getStudent(studentNumber).getFirstName());
		texts[1].setText(db.getStudent(studentNumber).getLastName());
		texts[2].setText(db.getStudent(studentNumber).getAddress());
		texts[3].setText(db.getStudent(studentNumber).getCity());
		texts[4].setText(db.getStudent(studentNumber).getState());
		texts[5].setText(db.getStudent(studentNumber).getZip());
		texts[6].setText(db.getStudent(studentNumber).getNumber());
		texts[7].setText(db.getStudent(studentNumber).getMajor());
		texts[8].setText(db.getStudent(studentNumber).getMinor());
		texts[9].setText(db.getStudent(studentNumber).getGpa());
		texts[10].setText(db.getStudent(studentNumber).getId());

		JPanel buttonPanel = new JPanel(); // creates button panel
		setLayout(new FlowLayout());
		JButton save = new JButton("Save");
		JButton edit = new JButton("Edit");

		edit.addActionListener(editInfo()); // calls editInfo()
		save.addActionListener(saveInfo()); // calls saveInfo()
		edit.setFont(textFieldFont);
		save.setFont(textFieldFont);
		
		buttonPanel.setOpaque(false);// sets panel to be invisible
		buttonPanel.add(edit, BorderLayout.SOUTH);
		buttonPanel.add(save, BorderLayout.SOUTH);

		add(buttonPanel);

	}

	/**
	 * ActionListener for edit button Sets specified textfields to be editable
	 * by user.
	 * 
	 */
	public static ActionListener editInfo() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 2; i < texts.length - 2; i++) {
					texts[i].setEditable(true);
				}
			}
		};
	}

	/**
	 * ActionListener for save button Saves info of textfields and saves it back
	 * into text file (which is called "studentDatabase.txt")
	 * 
	 */
	public static ActionListener saveInfo() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				for (int i = 0; i < texts.length; i++) {

					texts[i].setEditable(false);// sets textfields to be false
				}

				// sets each item in student object to be new value entered by
				// user in textfields
				db.getStudent(studentNumber).setAddress(texts[2].getText());
				db.getStudent(studentNumber).setCity(texts[3].getText());
				db.getStudent(studentNumber).setState(texts[4].getText());
				db.getStudent(studentNumber).setZip(texts[5].getText());
				db.getStudent(studentNumber).setNumber(texts[6].getText());
				db.getStudent(studentNumber).setMajor(texts[7].getText());
				db.getStudent(studentNumber).setMinor(texts[8].getText());

				try {
					db.createFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	/**
	 * Draws background image and student photo onto panel.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("PersonalInfoBackground.jpg").getImage();
		Image studentImage = new ImageIcon(db.getStudent(studentNumber).getStudentPhoto()).getImage();
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
		g.drawImage(studentImage, 500, 322, 300, 350, null);
	}

}
