import java.awt.*;
import javax.swing.*;


public class CampusMapTab extends JLabel {
	
	public CampusMapTab() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("CampusMapRIC.png").getImage();
		g.drawImage(img,0, 0, this.getWidth(), this.getHeight(), null);
	}
}
