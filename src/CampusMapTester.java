import javax.swing.*;

public class CampusMapTester {
	private static JFrame frame;
	public static JFrame getFrame() {
		return frame;
	}
	
	public static void main(String[] args) {
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 728);
		JTabbedPane window = new JTabbedPane();
		window.addTab("Campus Map", new CampusMapTab());
		window.addTab("Personal Info", new PersonalInfoTab());
		
		frame.getContentPane().add(window);

		frame.setVisible(true);
	}
}
