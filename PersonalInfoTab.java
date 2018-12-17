
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class PersonalInfoTab extends JPanel implements ActionListener {
	private String[] textFieldLabels = { "\nFirst Name: ", "\nLast Name: ", "Street Address: ", "City: ", "State: ",
			"Zip Code: ", "Phone Number: ", "Major: ", "Minor: ", "GPA: ", "Student ID: " };
	private String[] textFieldsTips = { "Enter First Name.", "Enter Last Name.",
			"Enter Street Address EX: 123 Smith Street ", "Enter City.", "Enter State. (Initials)", "Enter Zip Code.",
			"Enter Phone Number.", "Enter Major(s).", "Enter Minor(s)", "Enter GPA", "Enter Student ID" };
	private static JTextField[] texts; // text fields for personal info
	private static JPanel[] panels; // panels for personal info
	private static int studentNumber; // student # (what student you're showing)
	private static StudentDatabase db = StudentDatabase.getStudents();

	public PersonalInfoTab() {
		String student = LoginPanel.getUsername();

		if (student.equals("jcoulombe_0001")) {
			studentNumber = 1;
		}
		if (student.equals("ofelizlima_0002")) {
			studentNumber = 2;
		}
		if (student.equals("kfosberg_0003")) {
			studentNumber = 3;
		}
		if (student.equals("gcastigleigo_0004")) {
			studentNumber = 4;
		}
		if (student.equals("mgarcia_0005")) {
			studentNumber = 5;
		}

		// Adds panel for each textField
		panels = new JPanel[textFieldLabels.length];
		texts = new JTextField[panels.length];
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		JPanel name = new JPanel();
		JPanel location = new JPanel();
		JPanel degree = new JPanel();
		JPanel student1 = new JPanel();

		// adding text fields
		for (int i = 0; i < textFieldLabels.length; i++) {
			JTextField text = new JTextField(80);
			texts[i] = text;
			JLabel label;

			text.setToolTipText(textFieldsTips[i]);
			text.setEditable(false);
			panels[i].setOpaque(false);
			panels[i].add(label = new JLabel(textFieldLabels[i]));
			label.setForeground(Color.BLACK); // sets text color
			panels[i].add(text);
			if (i == 0 || i == 1) {
				text.setColumns(30);
				name.setOpaque(false);
				name.add(panels[i]);
			}
			if (i == 3 || i == 4 || i == 5) {
				text.setColumns(10);
				location.setOpaque(false);
				location.add(panels[i]);
			}
			if (i == 6 || i == 7 || i == 8) {
				text.setColumns(25);
				degree.setOpaque(false);
				degree.add(panels[i]);
			}
			if (i == 9 || i == 10) {
				text.setColumns(15);
				student1.setOpaque(false);
				student1.add(panels[i]);
			}
		}

		add(name, BorderLayout.SOUTH);
		add(panels[2], BorderLayout.SOUTH);
		add(location, BorderLayout.SOUTH);
		add(degree, BorderLayout.SOUTH);
		add(student1, BorderLayout.SOUTH);

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

		JPanel buttonPanel = new JPanel();
		setLayout(new FlowLayout());
		JButton save = new JButton("Save");
		JButton edit = new JButton("Edit");

		edit.addActionListener(editInfo());
		save.addActionListener(saveInfo());
		buttonPanel.setOpaque(false);
		buttonPanel.add(edit, BorderLayout.SOUTH);
		buttonPanel.add(save, BorderLayout.SOUTH);

		add(buttonPanel);

	}

	/* ActionListener for edit button */
	public static ActionListener editInfo() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (int i = 2; i < texts.length - 2; i++) {
					texts[i].setEditable(true);
				}
			}
		};
	}

	/* ActionListener for save button */
	public static ActionListener saveInfo() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				for (int i = 0; i < texts.length; i++) {

					texts[i].setEditable(false);
				}

				db.getStudent(studentNumber).setAddress(texts[2].getText());
				db.getStudent(studentNumber).setCity(texts[3].getText());
				db.getStudent(studentNumber).setState(texts[4].getText());
				db.getStudent(studentNumber).setZip(texts[5].getText());
				db.getStudent(studentNumber).setNumber(texts[6].getText());
				db.getStudent(studentNumber).setMajor(texts[7].getText());
				db.getStudent(studentNumber).setMinor(texts[8].getText());

				try {
					StudentDatabase.createFile("studentDatabase.txt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("PersonalInfoBackground.jpg").getImage();
		Image studentImage = new ImageIcon(db.getStudent(studentNumber).getStudentPhoto()).getImage();
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
		g.drawImage(studentImage, 500, 250, 300, 350, null);
	}

}
