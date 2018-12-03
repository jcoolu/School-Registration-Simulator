import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class StudentPanel extends JTabbedPane
{
	public StudentPanel ()
	{
		// calling the constructor of the JPanel class
		super();
		
		this.addTab("View Profile", new ProfilePanel());
		this.addTab("See my course", new SchedulePanel());
		this.addTab("Register", new RegistrationPanel());
		this.addTab("CampusMap", new CampusMapPanel());
		this.addTab("see my Bill", new BillPanel());
	}

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame ("Student Panel");
	     frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	     frame.pack();
	     
	    frame.getContentPane().add(new StudentPanel());
	      frame.pack();
	      frame.setVisible(true);
	}
}
