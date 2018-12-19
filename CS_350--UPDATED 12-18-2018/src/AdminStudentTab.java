import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class AdminStudentTab extends JPanel implements ComponentListener
{
	private JPanel leftPanel;
	private JPanel imagePanel;
	private JPanel rightPanel;
	private JLabel fnameLbl;
	public static JTextField fnameTxt;
	private JLabel lnameLbl;
	public static JTextField lnameTxt;
	private JLabel streetAddressLbl;
	public static JTextField streetAddressTxt;
	private JLabel cityLbl;
	public static JTextField cityTxt;
	private JLabel stateLbl;
	public static JTextField stateTxt;
	private JLabel zipcodeLbl;
	public static JTextField zipcodeTxt;
	private JLabel phoneLbl;
	public static JTextField phoneTxt;
	private JLabel majorLbl;
	public static JTextField majorTxt;
	private JLabel minorLbl;
	public static JTextField minorTxt;
	private JLabel gpaLbl;
	public static JTextField gpaTxt;
	private JLabel totalCreditsLbl;
	public static JTextField totalCreditsTxt;
	private JLabel studentImageLbl;
	private JButton previousBtn;
	private JButton nextBtn;
	private JButton newRecordBtn;
	private JButton saveBtn;
	private JButton deleteBtn;
	private JButton clearBtn;
	private JList<String> studentList;
	
	private StudentDatabase1 db = StudentDatabase1.getStudents();
	private int currentIndex = 0;
	
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
		
		studentImageLbl = new JLabel();
		ImageIcon stdImage = new ImageIcon("0000.jpg");
		Image img = stdImage.getImage();
		Image newImg = img.getScaledInstance(450, 310, Image.SCALE_DEFAULT);
		ImageIcon image = new ImageIcon(newImg);
		studentImageLbl.setIcon(image);

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
		
		fnameTxt.setText(db.getStudent(0).getFirstName());
		lnameTxt.setText(db.getStudent(0).getLastName());
		streetAddressTxt.setText(db.getStudent(0).getAddress());
		cityTxt.setText(db.getStudent(0).getCity());
		stateTxt.setText(db.getStudent(0).getState());
		zipcodeTxt.setText(db.getStudent(0).getZip());
		phoneTxt.setText(db.getStudent(0).getNumber());
		majorTxt.setText(db.getStudent(0).getMajor());
		minorTxt.setText(db.getStudent(0).getMinor());
		gpaTxt.setText(db.getStudent(0).getGpa());
		totalCreditsTxt.setText(db.getStudent(0).getTotalCredits());
		
		// creating all the button
		previousBtn = new JButton("<PREVIOUS");
		nextBtn = new JButton("NEXT>");
		newRecordBtn = new JButton("New Record");
		saveBtn = new JButton ("SAVE");
		deleteBtn = new JButton ("DELETE");
		clearBtn = new JButton ("CLEAR");
		
		
		String fnameAndID[] = new String[db.getSize()];
		
		for (int i = 0; i < db.getSize(); i++)
		{
			fnameAndID[i] = db.getStudent(i).getFirstName() + db.getStudent(i).getLastName() + " / ID => " +
					db.getStudent(i).getId();	
		}
		
		// creating the JList
		studentList = new JList<String>(fnameAndID);

		// creating the image panel
		imagePanel = new JPanel(); 
		imagePanel.setBorder(BorderFactory.createRaisedBevelBorder());
		imagePanel.setLayout(new BorderLayout());
		imagePanel.add(studentImageLbl, BorderLayout.CENTER);
		JPanel southPanel = new JPanel();
		southPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		JLabel findLbl = new JLabel("Find student by ID: ");
		JTextField searchTxt = new JTextField(10);
		JButton findBtn = new JButton ("Find");
		southPanel.add(findLbl);
		southPanel.add(searchTxt);
		southPanel.add(findBtn);
		imagePanel.add(southPanel, BorderLayout.SOUTH);
		JLabel IdLbl = new JLabel("ID => ");
		JTextField IdTxt = new JTextField(5);
		IdTxt.setEditable(false);
		IdTxt.setText(db.getStudent(0).getId());
		JPanel northPanel = new JPanel ();
		northPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		northPanel.add(IdLbl);
		northPanel.add(IdTxt);
		imagePanel.add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLACK);
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
		centerPanel.add(studentImageLbl);
		imagePanel.add(centerPanel, BorderLayout.CENTER);
		
		
		// left panel
		leftPanel = new JPanel();
		leftPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(), "Student Info"));
		leftPanel.setLayout(new GridLayout(11, 1, 0, -5));
		
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
		//JPanel panel12 = new JPanel();
		//JPanel panel13 = new JPanel();

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
		//panel11.setLayout(new FlowLayout(FlowLayout.LEFT));
		//panel12.setLayout(new FlowLayout(FlowLayout.LEFT));
		//panel13.setLayout(new FlowLayout(FlowLayout.LEFT));

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
		panel10.add(previousBtn);
		panel10.add(nextBtn);
		panel10.add(newRecordBtn);
		panel10.add(saveBtn);
		panel10.add(deleteBtn);
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
		leftPanel.add(panel10);
		leftPanel.add(panel11);
		//leftPanel.add(panel12);
		//leftPanel.add(panel13);


        rightPanel.add(new JScrollPane(studentList));

		// adding the 2 panels to the AdminStudentTab
		this.add(leftPanel);
		this.add(imagePanel);
		this.add(rightPanel);
		
		studentImageLbl.setIcon(new ImageIcon(db.getStudent(currentIndex).getStudentPhoto()));
		
		clearBtn.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0)
			{
				fnameTxt.setText("");
				lnameTxt.setText("");
				streetAddressTxt.setText("");
				cityTxt.setText("");
				stateTxt.setText("");
				zipcodeTxt.setText("");
				phoneTxt.setText("");
				majorTxt.setText("");
				minorTxt.setText("");
				totalCreditsTxt.setText("");
				gpaTxt.setText("");
			}
		});
		
		// Test purpose
		System.out.println(db.getStudentDB().indexOf(db.getStudentDB().get(Integer.parseInt(IdTxt.getText()))));
		
		
		 
		nextBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				
				if (currentIndex == db.getSize() - 1)
				{
					currentIndex = 0;
				}
				else 
				{
					currentIndex = currentIndex+1;
				}
				
				
					
				fnameTxt.setText(db.getStudent(currentIndex).getFirstName());
				lnameTxt.setText(db.getStudent(currentIndex).getLastName());
				streetAddressTxt.setText(db.getStudent(currentIndex).getAddress());
				cityTxt.setText(db.getStudent(currentIndex).getCity());
				stateTxt.setText(db.getStudent(currentIndex).getState());
				zipcodeTxt.setText(db.getStudent(currentIndex).getZip());
				phoneTxt.setText(db.getStudent(currentIndex).getNumber());
				majorTxt.setText(db.getStudent(currentIndex).getMajor());
				minorTxt.setText(db.getStudent(currentIndex).getMinor());
				gpaTxt.setText(db.getStudent(currentIndex).getGpa());
				totalCreditsTxt.setText(db.getStudent(currentIndex).getTotalCredits());
				IdTxt.setText(db.getStudent(currentIndex).getId());
				studentImageLbl.setIcon(new ImageIcon(db.getStudent(currentIndex).getStudentPhoto()));
			
			}
		});
		
		
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