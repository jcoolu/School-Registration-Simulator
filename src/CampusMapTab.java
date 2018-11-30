import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class CampusMapTab extends JLabel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon("CampusMapRIC.png").getImage();
		g.drawImage(img,0, 0, this.getWidth(), this.getHeight(), null);
	}
	}
	
