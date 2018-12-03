import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Driver 
{
	private static JFrame w;
	public static void main(String[] args) 
	{
		w = new JFrame();
		w.setTitle("Login");
		w.setMinimumSize(new Dimension (500, 350));
		LoginPanel myLoginPanel = new LoginPanel();
		w.add(myLoginPanel);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.pack();
		w.setVisible(true);	
	}
	
	public static JFrame getJFrame()
	{
		return w;
	}

}
