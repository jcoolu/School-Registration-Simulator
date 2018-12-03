import javax.swing.JTabbedPane;

public class AdminPanel extends JTabbedPane
{
	public AdminPanel ()
	{
		// calling the constructor of the JPanel class
		super();

		this.addTab("Courses Database", new CoursesDatabasePanel());
		this.addTab("students Database", new studentsDatabasePanel());
	}
}
