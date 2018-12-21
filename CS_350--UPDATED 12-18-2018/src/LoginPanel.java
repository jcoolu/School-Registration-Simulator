import java.awt.Color; 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * @author Mamethierno Gadiaga
 *
 */
@SuppressWarnings("serial")
public class LoginPanel extends JPanel implements ComponentListener
{
	// Defining the instance variables of the LoginPanel class
	private  JLabel usernameLbl;         // represents the user name label
	private static JTextField usernameTxt;     // represents the user name text field
	private JLabel passwordLbl;         // represents the password label
	private JPasswordField passwordTxt;     // represents the password text field
	private JButton loginBtn;           // represents the login button
	private JPanel componentsPanel;     // represents the center panel that holds the components above
	private JLabel errorIcon;
	private JLabel errorMessage;
	private static ArrayList<String> loginInfosArray = new ArrayList<String>();
	private static ArrayList<String> usernamesArray = new ArrayList<String>();
	private static ArrayList<String> passwordsArray = new ArrayList<String>();
	private static ArrayList<String> categoryArray = new ArrayList<String>();
	public static JFrame studentFrame = new JFrame();
	private static JFrame adminFrame = new JFrame();


	/**
	 * The non-argument constructor of the LoginPanel class.
	 * It is used to instantiate the LoginPanel class by creating an object of type LoginPanel
	 */
	public LoginPanel ()
	{
		// calling the constructor of the JPanel class
		super();

		// Setting the layout of the login panel
		this.setLayout(new FlowLayout(FlowLayout.CENTER)); // This is default layout, so i didn't have to write this statement

		// Initializing the instance variables by creating the components
		usernameLbl = new JLabel ("USERNAME");
		usernameTxt = new JTextField (28);
		passwordLbl = new JLabel ("PASSWORD");
		passwordTxt = new JPasswordField(28);
		errorIcon = new JLabel(new ImageIcon(""));
		errorMessage = new JLabel ("");
		loginBtn = new JButton("LOGIN");

		// Creating the component panel
		componentsPanel = new JPanel();

		// Configuring the componentsPanel
		componentsPanel.setLayout(new GridLayout(7, 1, -5, -5));
		componentsPanel.setBackground(new Color (0,0,0,40));


		// Creating 7 empty panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();

		// Setting the layouts of each of the 7 panels
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel6.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel7.setLayout(new FlowLayout(FlowLayout.LEFT));

		// Setting the background of each of the 7 Panels
		panel1.setBackground(new Color (10,99,110,0));
		panel2.setBackground(new Color (10,99,110,0));
		panel3.setBackground(new Color (10,99,110,0));
		panel4.setBackground(new Color (10,99,110,0));
		panel5.setBackground(new Color (10,99,110,0));
		panel6.setBackground(new Color (10,99,110,0));
		panel7.setBackground(new Color (10,9,10,150));

		// Adding 1 components per panel
		panel1.add(usernameLbl);
		panel2.add(new JLabel(new ImageIcon("username.png")));
		panel2.add(usernameTxt);
		panel3.add(passwordLbl);
		panel4.add(new JLabel(new ImageIcon("password.png")));
		panel4.add(passwordTxt);
		panel5.add(loginBtn);
		panel6.add(new JLabel(""));
		panel7.add(errorIcon);
		panel7.add(errorMessage);

		// Adding the 7 panels to the componentsPanel
		componentsPanel.add(panel1);
		componentsPanel.add(panel2);
		componentsPanel.add(panel3);
		componentsPanel.add(panel4);
		componentsPanel.add(panel5);
		componentsPanel.add(panel6);
		componentsPanel.add(panel7);

		// adding the componentsPanel to the loginPanel
		this.add(componentsPanel);

		// Registering a CompenentListener to the login panel
		this.addComponentListener(this);

		fillInTheArrays();
		System.out.println(loginInfosArray);
		System.out.println(usernamesArray);
		System.out.println(passwordsArray);
		System.out.println(categoryArray);

		loginBtn.addActionListener(new ActionListener()
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
				int counter = 0;
				boolean matchIsFound = false;

				while (matchIsFound == false && counter < passwordsArray.size())
				{
					if (passwordsArray.get(counter).equals(passwordTxt.getText()) &&
							usernamesArray.get(counter).equalsIgnoreCase(usernameTxt.getText()) &&
							passwordsArray.indexOf(passwordsArray.get(counter)) == usernamesArray.indexOf(usernameTxt.getText())
							)
					{
						matchIsFound = true;
						System.out.println("logged in");

						if (categoryArray.get(counter).equalsIgnoreCase("std"))
						{
							studentFrame.setTitle("Student Frame");
							studentFrame.setMinimumSize(new Dimension (500, 300));
							studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							studentFrame.add(new StudentPanel());
							studentFrame.pack();
							studentFrame.setVisible(true);
							Driver.getJFrame().dispose();  // Disposing the login frame

						}
						else if (categoryArray.get(counter).equalsIgnoreCase("adm"))
						{
							adminFrame.setTitle("Administrator Frame");
							adminFrame.setMinimumSize(new Dimension (500, 300));
							adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							adminFrame.add(new AdminPanel());
							adminFrame.pack();
							adminFrame.setVisible(true);
							Driver.getJFrame().dispose(); // Disposing the login frame
						}	
					}
					counter++;
				}

				if (matchIsFound == false)
				{
					errorIcon.setIcon(new ImageIcon("redCross.png"));
					errorMessage.setText("Either the username and/or password is/are incorrect");
					errorMessage.setForeground(Color.WHITE);
				}

				repaint();
			}
		});

		usernameTxt.addFocusListener(new FocusListener()
		{

			@Override
			public void focusGained(FocusEvent arg0)
			{
				errorIcon.setIcon(new ImageIcon(""));
				errorMessage.setText("");
				repaint();
			}
			
			public void focusLost(FocusEvent arg0) {}
		});

		passwordTxt.addFocusListener(new FocusListener()
		{

			@Override
			public void focusGained(FocusEvent arg0)
			{
				errorIcon.setIcon(new ImageIcon(""));
				errorMessage.setText("");
				repaint();
			}
			public void focusLost(FocusEvent arg0){}
		});
		
		try {
			StudentDatabase.createArrayList();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fillInTheArrays()
	{
		Scanner sc = null;
		try 
		{
			File abstractFile = new File ("loginDatabase.txt");
			sc = new Scanner (abstractFile);

			while (sc.hasNextLine())
			{
				loginInfosArray.add(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}

		for (int i = 0; i < loginInfosArray.size(); i++)
		{
			if (loginInfosArray.isEmpty() == false)
			{
				String [] eachLineArray = new String [3];
				eachLineArray = loginInfosArray.get(i).split(",");

				usernamesArray.add(eachLineArray[0]);
				passwordsArray.add(eachLineArray[1]);
				categoryArray.add(eachLineArray[2]);
			}	
		}
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		Image myBackgroundimg = new ImageIcon ("loginimg.jpeg").getImage();
		g.drawImage(myBackgroundimg, 0, 0, Driver.getJFrame().getWidth(), Driver.getJFrame().getHeight(), null);
	}

	public void componentHidden(ComponentEvent e){}
	public void componentMoved(ComponentEvent e) {}
	public void componentShown(ComponentEvent e){}
	public void componentResized(ComponentEvent e)
	{
		componentsPanel.setLocation( ((this.getWidth() - componentsPanel.getWidth()) / 2), 
				((this.getHeight() - componentsPanel.getHeight()) / 2) );
	}

	public static JFrame getStudentFrame()
	{
		return studentFrame;	
	}

	public static JFrame getAdminFrame()
	{
		return adminFrame;	
	}
	
	public static String getUsername() {
		return usernameTxt.getText();
	}
}
