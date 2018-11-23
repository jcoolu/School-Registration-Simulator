import java.awt.EventQueue;
import javax.swing.JFrame;

public class CourseInterFaceTester {
	public static void main(String[] args) {
		Runnable runnable = new Runnable(){
			public void run(){
				JFrame frame = new CourseInterface();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}};
		EventQueue.invokeLater(runnable);
	}
}//end of public class
