import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class StudentPanel extends JTabbedPane
{
	public StudentPanel ()
	{
		// calling the constructor of the JPanel class
		super();

		this.addTab("Personal Info", new PersonalInfoTab());
		this.addTab("Add course", new RegistrationTab());
		this.addTab("Drop Course", new DeRegistrationTab());
		this.addTab("Campus Map", new CampusMapTab());
	}
}
