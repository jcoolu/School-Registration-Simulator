import java.awt.Dimension;
import java.io.File;

import javax.swing.JFrame;

public class Driver {
    private static JFrame w;

    public static void main(String[] args) {
        //StudentDatabase myStudentDB = StudentDatabase.getStudents();
        //CourseDatabase myCourseDB = CourseDatabase.getCourses();
        w = new JFrame();
        w.setTitle("Login");
        w.setMinimumSize(new Dimension(500, 350));
        LoginPanel myLoginPanel = new LoginPanel();
        System.out.println(new File("loginDatabase.txt").getAbsolutePath());
        w.add(myLoginPanel);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.pack();
        w.setVisible(true);
    }

    public static JFrame getJFrame() {
        return w;
    }

}
