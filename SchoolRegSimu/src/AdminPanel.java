import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class AdminPanel extends JTabbedPane
{
	public AdminPanel ()
	{
		// calling the constructor of the JPanel class
		super();

		this.addTab("Students Database", new AdminStudentTab());
		this.addTab("Courses Database", new AdminCourseTab());
	}
}
