import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class DeRegistrationTab extends JPanel //implements ActionListener
{
    public JLabel schedule_lbl;
    public JTextArea schedule_txt;
    public JLabel course_lbl;
    public JTextField course_txt;
    public JButton dropClass;
    public JPanel panel;
    public JFrame frame;
    public int studentNumber;
    private static StudentDatabase1 db = StudentDatabase1.getStudents();
    //private Student myStudent;

    public DeRegistrationTab()
    {
        super();

        String student = LoginPanel.getUsername();

        if (student.equals("jcoulombe_0001")) 
        {
            studentNumber = 1;
        }
        if (student.equals("ofelizlima_0002")) 
        {
            studentNumber = 2;
        }
        if (student.equals("kfosberg_0003")) 
        {
            studentNumber = 3;
        }
        if (student.equals("gcastigliego_0004")) 
        {
            studentNumber = 4;
        }
        if (student.equals("mgarcia_0005")) 
        {
            studentNumber = 5;
        }

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        schedule_lbl = new JLabel("SCHEDULE:");
        schedule_txt = new JTextArea(15,30);
        course_lbl = new JLabel("COURSE NUMBER:");
        course_txt = new JTextField(4);
        dropClass = new JButton("Drop");

        // Creating the component panel
        panel = new JPanel();

        // Configuring the componentsPanel
        panel.setLayout(new GridLayout(7, 1, -5, -5));
        //panel.setBackground(new Color (0,0,0,40));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        //JPanel panel3 = new JPanel();
        //JPanel panel4 = new JPanel();
        //JPanel panel5 = new JPanel();

        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        //panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        //panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        //panel5.setLayout(new FlowLayout(FlowLayout.LEFT));

        //panel1.setBackground(new Color (10,99,110,0));
        //panel2.setBackground(new Color (10,99,110,0));
        //panel3.setBackground(new Color (10,99,110,0));
        //panel4.setBackground(new Color (10,99,110,0));
        //panel5.setBackground(new Color (10,99,110,0));

        panel1.add(schedule_lbl);
        panel1.add(schedule_txt,BorderLayout.NORTH);
        panel2.add(course_lbl);
        panel2.add(course_txt);
        panel2.add(dropClass);

        panel.add(panel1);
        panel.add(panel2);
        //panel.add(panel3);
        //panel.add(panel4);
        //panel.add(panel5);

        this.add(panel);
        
        schedule_txt.setText(db.getStudent(studentNumber).getScheduleToString());

        dropClass.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent arg0)
        {
            System.out.println(db.getStudent(studentNumber).getId());
            db.getStudent(studentNumber).removeCourseCode(course_txt.getText());
            
            
            // for(int i = 0;i < db.getStudent(studentNumber).getScheduleSize();i++)
            // {
                // if(db.getStudent(studentNumber).getSchedule().get(i).getCourseCode().equalsIgnoreCase(course_txt.getText()))
                // {
                    // db.getStudent(studentNumber).removeCourseIndex(i);
                // }
            // }
            try{
                db.createFile();
                schedule_txt.setText(db.getStudent(studentNumber).getScheduleToString());
            }
            catch(IOException e)
            {
                e.getMessage();
            }
        }
            });
    }

    // @Override
    // public void actionPerformed(ActionEvent e) 
    // {
    // }

    // public void paintComponent(Graphics g) 
    // {
    // super.paintComponent(g);
    // }
}