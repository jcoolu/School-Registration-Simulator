import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JFrame;

public class CampusMapTester {
	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame("Campus Map");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 728);
		frame.getContentPane().add(new CampusMapTab());

		frame.setVisible(true);
	}
}
