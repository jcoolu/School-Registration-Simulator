
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

	public PersonalInfoTab() {
		String student = LoginPanel.getUsername();
		System.out.println(StudentDatabase.getStudent(1).getFirstName());
		if(student.equals("jcoulombe_0001")) {
			studentNumber = 1;
		}
		if(student.equals("ofelizlima_0002")) {
			studentNumber = 2;
		}
		if(student.equals("kfosberg_0003")) {
			studentNumber = 3;
		}
		if(student.equals("gcastigleigo_0004")) {
			studentNumber = 4;
		}
		if(student.equals("mgarcia_0005")) {
			studentNumber = 5;
		}

		setLayout(new FlowLayout(FlowLayout.LEFT));
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
			JTextField text = new JTextField(60);
			texts[i] = text;
			JLabel label;
			text.setToolTipText(textFieldsTips[i]);
			text.setEditable(false);
			panels[i].add(label = new JLabel(textFieldLabels[i]));
			label.setForeground(Color.BLACK); // sets text color
			panels[i].add(text);
			if (i == 0 || i == 1) {
				text.setColumns(30);
				name.add(panels[i]);
			}
			if (i == 3 || i == 4 || i == 5) {
				text.setColumns(10);
				location.add(panels[i]);
			}
			if (i == 6 || i == 7 || i == 8) {
				text.setColumns(25);
				degree.add(panels[i]);
			}
			if (i == 9 || i == 10) {
				text.setColumns(15);
				student1.add(panels[i]);
			}
		}
		add(name);
		add(panels[2]);
		add(location);
		add(degree);
		add(student1);

		texts[0].setText(StudentDatabase.getStudent(studentNumber).getFirstName());
		texts[1].setText(StudentDatabase.getStudent(studentNumber).getLastName());
		texts[2].setText(StudentDatabase.getStudent(studentNumber).getAddress());
		texts[3].setText(StudentDatabase.getStudent(studentNumber).getCity());
		texts[4].setText(StudentDatabase.getStudent(studentNumber).getState());
		texts[5].setText(StudentDatabase.getStudent(studentNumber).getZip());
		texts[6].setText(StudentDatabase.getStudent(studentNumber).getNumber());
		texts[7].setText(StudentDatabase.getStudent(studentNumber).getMajor());
		texts[8].setText(StudentDatabase.getStudent(studentNumber).getMinor());
		texts[9].setText(StudentDatabase.getStudent(studentNumber).getGpa());
		texts[10].setText(StudentDatabase.getStudent(studentNumber).getId());

		JPanel buttonPanel = new JPanel();
		setLayout(new FlowLayout());
		JButton save = new JButton("Save");
		JButton edit = new JButton("Edit");

		edit.addActionListener(editInfo());
		save.addActionListener(saveInfo());
		buttonPanel.add(edit);
		buttonPanel.add(save);

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
					StudentDatabase.getStudent(studentNumber).setFirstName(texts[0].getText());
					StudentDatabase.getStudent(studentNumber).setLastName(texts[1].getText());
					StudentDatabase.getStudent(studentNumber).setAddress(texts[2].getText());
					StudentDatabase.getStudent(studentNumber).setZip(texts[3].getText());
					StudentDatabase.getStudent(studentNumber).setNumber(texts[4].getText());
					StudentDatabase.getStudent(studentNumber).setMajor(texts[5].getText());
					StudentDatabase.getStudent(studentNumber).setMinor(texts[6].getText());
					StudentDatabase.getStudent(studentNumber).setGpa(texts[7].getText());
					StudentDatabase.getStudent(studentNumber).setId(texts[8].getText());
					texts[i].setEditable(false);
					try {
						StudentDatabase.createFile("studentDatabase.txt");
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

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("data.jpg").getImage();
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}

}
