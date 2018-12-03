import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CoursesDatabasePanel extends JPanel
{
	private JButton myButton = new JButton("click me");
	private JTextField myTextField = new JTextField(10);
	
	public CoursesDatabasePanel()
	{
		this.add(myButton);
		this.add(myTextField);
		
		myButton.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						myTextField.setText("Thank u so much");
						repaint();
					}
				});
	}
	
	public class ButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
		
		}
		
	}
}
