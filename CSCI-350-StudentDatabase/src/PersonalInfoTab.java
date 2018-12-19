import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PersonalInfoTab extends JPanel implements ActionListener {
	private String[] textFieldLabels = { "\nFirst Name: ", "\nLast Name: ", "Street Address: ", "City: ", "State: ",
			"Zip Code: ", "Major: ", "Minor: ", "GPA: ", "Student ID: " };
	private String[] textFieldsTips = { "Enter First Name.", "Enter Last Name.",
			"Enter Street Address EX: 123 Smith Street ", "Enter City.", "Enter State. (Initials)", "Enter Zip Code.",
			"Enter Major(s).", "Enter Minor(s)", "Enter GPA", "Enter Student ID" };
	private static JTextField[] texts; // text fields for personal info
	private static JPanel[] panels; // panels for personal info

	public PersonalInfoTab() {
		// Adds panel for each textField
		panels = new JPanel[textFieldLabels.length];
		texts = new JTextField[panels.length];
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		JPanel name = new JPanel();
		JPanel location = new JPanel();
		JPanel degree = new JPanel();
		JPanel student = new JPanel();

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
			if (i == 6 || i == 7) {
				text.setColumns(25);
				degree.add(panels[i]);
			}
			if (i == 8 || i == 9) {
				text.setColumns(15);
				student.add(panels[i]);
			}
		}
		add(name);
		add(panels[2]);
		add(location);
		add(degree);
		add(student);

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
				for (int i = 0; i < texts.length - 2; i++) {
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