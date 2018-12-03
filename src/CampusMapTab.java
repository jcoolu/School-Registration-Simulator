import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class CampusMapTab extends JPanel implements MouseMotionListener {
	
	public CampusMapTab() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		JButton button = new JButton();
		button.setBounds(291, 125, 20, 20);
		button.setToolTipText("<html>My multi-line<br>tooltip.</html>");
		//makes button transparent
		button.setContentAreaFilled(false);
		//test.setBorderPainted(false);
		add(button);
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("CampusMapRIC.png").getImage();
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		saySomething("Mouse dragged", arg0);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		// TODO Auto-generated method stub
		saySomething("Mouse moved", arg0);
		if(arg0.getX() == 200) {
				
		}
	}
	
	void saySomething(String eventDescription, MouseEvent e) {
        System.out.println(eventDescription 
                        + " (" + e.getX() + "," + e.getY() + ")"
                        + " detected on "
                        + e.getComponent().getClass().getName());
    }
}
