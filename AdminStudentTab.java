import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AdminStudentTab extends JPanel implements ComponentListener
{
	private JPanel leftPanel;
	private JPanel imagePanel;
	private JPanel rightPanel;
	private JLabel fnameLbl;
	private JTextField fnameTxt;
	private JLabel lnameLbl;
	private JTextField lnameTxt;
	private JLabel streetAddressLbl;
	private JTextField streetAddressTxt;
	private JLabel cityLbl;
	private JTextField cityTxt;
	private JLabel stateLbl;
	private JTextField stateTxt;
	private JLabel zipcodeLbl;
	private JTextField zipcodeTxt;
	private JLabel phoneLbl;
	private JTextField phoneTxt;
	private JLabel majorLbl;
	private JTextField majorTxt;
	private JLabel minorLbl;
	private JTextField minorTxt;
	private JLabel gpaLbl;
	private JTextField gpaTxt;
	private JLabel totalCreditsLbl;
	private JTextField totalCreditsTxt;
	private JLabel studentImageLbl;
	private JButton previousBtn;
	private JButton nextBtn;
	private JButton newRecordBtn;
	private JButton saveBtn;
	private JButton deleteBtn;
	private JButton clearBtn;
	private JList<String> studentList;
	


	public AdminStudentTab ()
	{
		// calling the constructor of the JPanel class
		super();
		
		// setting the layout of the panel StudentsDatabasePAnel
		this.setLayout(new GridLayout(1, 3));

		// creating all the labels of the AdminStudentTab
		fnameLbl = new JLabel("First Name:          ");
		lnameLbl = new JLabel("Last Name:          ");
		streetAddressLbl = new JLabel("Street Address:  ");
		cityLbl = new JLabel("City:                        ");
		stateLbl = new JLabel("State: ");
		zipcodeLbl = new JLabel("Zip Code: ");
		phoneLbl = new JLabel("Phone Number:   ");
		majorLbl = new JLabel("Major:                    ");
		minorLbl = new JLabel("Minor:                    ");
		gpaLbl = new JLabel("GPA:                       ");
		totalCreditsLbl = new JLabel("Total Credits:       ");
		studentImageLbl = new JLabel(new ImageIcon(""));

		// Creating the text fields and combo box of the AdminStudentTab
		fnameTxt = new JTextField(25);
		lnameTxt = new JTextField(25);
		streetAddressTxt = new JTextField(25);
		cityTxt = new JTextField(7);
		stateTxt = new JTextField(2);
		zipcodeTxt = new JTextField(5);
		phoneTxt = new JTextField(25);
		majorTxt = new JTextField(25);
		minorTxt = new JTextField(25);
		gpaTxt = new JTextField(25);
		totalCreditsTxt = new JTextField(25);
		
		// creating all the button
		previousBtn = new JButton("<PREVIOUS");
		nextBtn = new JButton("NEXT>");
		newRecordBtn = new JButton("New Record");
		saveBtn = new JButton ("SAVE");
		deleteBtn = new JButton ("DELETE");
		clearBtn = new JButton ("CLEAR");
		
		String week[]= { "Monday","Tuesday","Wednesday", 
                "Thursday","Friday","Saturday","Sunday",
                "Monday","Tuesday","Wednesday", 
                "Thursday","Friday","Saturday","Sunday",
                "Monday","Tuesday","Wednesday", 
                "Thursday","Friday","Saturday","Sunday",
                "Monday","Tuesday","Wednesday", 
                "Thursday","Friday","Saturday","Sunday",
                "Monday","Tuesday","Wednesday", 
                "Thursday","Friday","Saturday","Sunday"}; 
		
		// creating the JList
		//DefaultListModel dlm = new DefaultListModel();
		studentList = new JList<String>(week);
		
		

		// creating the image panel
		imagePanel = new JPanel(); 
		imagePanel.setBorder(BorderFactory.createRaisedBevelBorder());
		imagePanel.setLayout(new BorderLayout());
		imagePanel.add(studentImageLbl);
		imagePanel.add(studentImageLbl, BorderLayout.CENTER);
		
		// left panel
		leftPanel = new JPanel();
		leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "Student Info"));
		leftPanel.setLayout(new GridLayout(13, 1, 0, -5));
		
		// right panel
		rightPanel = new JPanel();
		rightPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "All Students"));
		rightPanel.setLayout(new BorderLayout());

		// Creating the panels that goes in the left Panel
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();

		// Setting the layout of the panel
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel7.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel8.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel9.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel10.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel11.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel12.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel13.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel1.add(fnameLbl);
		panel1.add(fnameTxt);
		panel2.add(lnameLbl);
		panel2.add(lnameTxt);
		panel3.add(streetAddressLbl);
		panel3.add(streetAddressTxt);
		panel4.add(cityLbl);
		panel4.add(cityTxt);
		panel4.add(stateLbl);
		panel4.add(stateTxt);
		panel4.add(zipcodeLbl);
		panel4.add(zipcodeTxt);
		panel5.add(phoneLbl);
		panel5.add(phoneTxt);
		panel6.add(majorLbl);
		panel6.add(majorTxt);
		panel7.add(minorLbl);
		panel7.add(minorTxt);
		panel8.add(totalCreditsLbl);
		panel8.add(totalCreditsTxt);
		panel9.add(gpaLbl);
		panel9.add(gpaTxt);
		panel11.add(previousBtn);
		panel11.add(nextBtn);
		panel11.add(newRecordBtn);
		panel11.add(saveBtn);
		panel11.add(deleteBtn);
		panel11.add(clearBtn);


		leftPanel.add(panel1);
		leftPanel.add(panel2);
		leftPanel.add(panel3);
		leftPanel.add(panel4);
		leftPanel.add(panel5);
		leftPanel.add(panel6);
		leftPanel.add(panel7);
		leftPanel.add(panel8);
		leftPanel.add(panel9);
		leftPanel.add(panel10);
		leftPanel.add(panel11);
		leftPanel.add(panel12);
		leftPanel.add(panel13);


        rightPanel.add(new JScrollPane(studentList));

		// adding the 2 panels to the AdminStudentTab
		this.add(leftPanel);
		this.add(imagePanel);
		this.add(rightPanel);
	}

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame ("Student Panel");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.pack();

		frame.getContentPane().add(new AdminStudentTab());
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		this.repaint();
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
