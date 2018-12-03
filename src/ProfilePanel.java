import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProfilePanel extends JPanel
{
	private JButton signout = new JButton("sign out");
	public ProfilePanel ()
	{
		this.add(signout);
		
		signout.addActionListener(signOutListener());
	}
	
	public static ActionListener signOutListener()
	{
		final class SignOutlistenerClass implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame w;
				w = new JFrame();
				w.setTitle("Login");
				w.setMinimumSize(new Dimension (500, 350));
				LoginPanel myLoginPanel = new LoginPanel();
				w.add(myLoginPanel);
				w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				w.pack();
				w.setVisible(true);	
				
				LoginPanel.studentFrame.dispose();
				
			}
		}
		return new SignOutlistenerClass();
	}
	

}
