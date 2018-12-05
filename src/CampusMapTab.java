import java.awt.*;
import javax.swing.*;

/**
 * CampusMapTab -- Displays CampusMapRIC.png and allows user
 * to hover over buttons, which display the 
 * corresponding building info.
 * 
 * @author JMCoo
 *
 */
public class CampusMapTab extends JPanel {

	public CampusMapTab() {
		setLayout(null);

		// Sherlock Center on Disabilities Building
		JButton sherlock = new JButton();
		CampusMapTab.addButton(sherlock, 565, 25, "<b><u>Sherlock Center on Disabilities</b></u><br>tooltip.");
		add(sherlock);

		// Building 8 - Outreach Programs
		JButton outReach = new JButton();
		CampusMapTab.addButton(outReach, 572, 60, "<b><u>Building 8 - Outreach Programs</b></u>");
		add(outReach);

		// Guardo Hall
		JButton guardo = new JButton();
		CampusMapTab.addButton(guardo, 572, 215, "<b><u>Guardo Hall</b></u>");
		add(guardo);

		// Kauffman Center
		JButton kauffman = new JButton();
		CampusMapTab.addButton(kauffman, 579, 291, "<b><u>Kauffman Center</b></u>");
		add(kauffman);

		// Welcome Center
		JButton welcome = new JButton();
		CampusMapTab.addButton(welcome, 658, 324, "<b><u>Welcome Center</b></u>");
		add(welcome);

		// Forman Center - Admissions
		JButton forman = new JButton();
		CampusMapTab.addButton(forman, 538, 207, "<b><u>Forman Center - Admissions</b></u>");
		add(forman);

		// Yellow Cottage
		JButton yellow = new JButton();
		CampusMapTab.addButton(yellow, 542, 165, "<b><u>Yellow Cottage</b></u>");
		add(yellow);

		// Recreation Center
		JButton recreation = new JButton();
		CampusMapTab.addButton(recreation, 520, 90, "<b><u>Recreation Center</b></u>");
		add(recreation);

		// Building 6 - Human Resources/Upward Bound
		JButton human = new JButton();
		CampusMapTab.addButton(human, 440, 75, "<b><u>Building 6 - Human Resources</b></u>");
		add(human);

		// Building 5 - Accounting/Payroll/Purchasing
		JButton account = new JButton();
		CampusMapTab.addButton(account, 460, 99, "<b><u>Building 5 - Accounting/Payroll/Purchasing</b></u>");
		add(account);

		// Building 4 - Bursar/Records
		JButton bursar = new JButton();
		CampusMapTab.addButton(bursar, 463, 145, "<b><u>Building 4 - Bursar/Records</b></u>");
		add(bursar);

		// Building 3 - Financial Aid/Classrooms/Cafe
		JButton financial = new JButton();
		CampusMapTab.addButton(financial, 470, 177, "<b><u>Building 3 - Financial Aid/Classrooms/Cafe</b></u>");
		add(financial);

		// Building 2 - Offices
		JButton offices = new JButton();
		CampusMapTab.addButton(offices, 473, 207, "<b><u>Building 2 - Offices</b></u>");
		add(offices);

		// Building 1 - Information Services
		JButton info = new JButton();
		CampusMapTab.addButton(info, 478, 257, "<b><u>Building 1 - Information Services</b></u>");
		add(info);

		// Cooperative Preschool
		JButton preschool = new JButton();
		CampusMapTab.addButton(preschool, 406, 240, "<b><u>Cooperative Preschool</b></u>");
		add(preschool);

		// Whipple Hall
		JButton whipple = new JButton();
		CampusMapTab.addButton(whipple, 377, 240, "<b><u>Whipple Hall</b></u>");
		add(whipple);

		// Nazarian Center for the Performing Arts
		JButton arts = new JButton();
		CampusMapTab.addButton(arts, 385, 288, "<b><u>Nazarian Center for the Performing Arts</b></u>");
		add(arts);

		// Keefe Transportation Center
		JButton keefe = new JButton();
		CampusMapTab.addButton(keefe, 377, 395, "<b><u>Keefe Transportation Center</b></u>");
		add(keefe);

		// Roberts Hall
		JButton roberts = new JButton();
		CampusMapTab.addButton(roberts, 358, 327, "<b><u>Roberts Hall</b></u>");
		add(roberts);

		// ALEX AND ANI Hall
		JButton alex = new JButton();
		CampusMapTab.addButton(alex, 305, 313, "<b><u>ALEX AND ANI Hall</b></u>");
		add(alex);

		// Alger Hall
		JButton alger = new JButton();
		CampusMapTab.addButton(alger, 298, 248, "<b><u>Alger Hall</b></u>");
		add(alger);

		// Craig-Lee Hall
		JButton craig = new JButton();
		CampusMapTab.addButton(craig, 256, 259, "<b><u>Craig-Lee Hall</b></u>");
		add(craig);

		// Clarke Science Building
		JButton clarke = new JButton();
		CampusMapTab.addButton(clarke, 256, 200, "<b><u>Clarke Science Building</b></u>");
		add(clarke);

		// Fogarty Life Science Building - School of Nursing
		JButton fogarty = new JButton();
		CampusMapTab.addButton(fogarty, 226, 140, "<b><u>Fogarty Life Science Building - School of Nursing</b></u>");
		add(fogarty);

		// Henry Barnard Laboratory School
		JButton henry = new JButton();
		CampusMapTab.addButton(henry, 244, 350, "<b><u>Henry Barnard Laboratory School</b></u>");
		add(henry);

		// Adams Library
		JButton library = new JButton();
		CampusMapTab.addButton(library, 205, 214, "<b><u>Adams Library</b></u>");
		add(library);

		// Gaige Hall
		JButton gaige = new JButton();
		CampusMapTab.addButton(gaige, 145, 247, "<b><u>Gaige Hall</b></u>");
		add(gaige);

		// Building 27 - Storage Building
		JButton storage = new JButton();
		CampusMapTab.addButton(storage, 56, 188, "<b><u>Building 27 - Storage Building</b></u>");
		add(storage);

		// Building 26 - Student - Athlete Success Center
		JButton athlete = new JButton();
		CampusMapTab.addButton(athlete, 83, 222, "<b><u>Building 26 - Student - Athlete Success Center</b></u>");
		add(athlete);

		// Physical Plant Building - College Receiving
		JButton plant = new JButton();
		CampusMapTab.addButton(plant, 51, 274, "<b><u>Physical Plant Building - College Receiving</b></u>");
		add(plant);

		// Building 30 - English Department/Offices
		JButton english = new JButton();
		CampusMapTab.addButton(english, 22, 293, "<b><u>English Department/Offices</b></u>");
		add(english);

		// The Murray Center - Health, Physical Education, Athletics
		JButton murray = new JButton();
		CampusMapTab.addButton(murray, 104, 281,
				"<b><u>The Murray Center - Health, Physical Education, Athletics</b></u>");
		add(murray);

		// Student Union
		JButton union = new JButton();
		CampusMapTab.addButton(union, 164, 311, "<b><u>Student Union</b></u>");
		add(union);

		// Donovan Dining Center
		JButton donovan = new JButton();
		CampusMapTab.addButton(donovan, 189, 330, "<b><u>Donovan Dining Center</b></u>");
		add(donovan);

		// Faculty Center
		JButton faculty = new JButton();
		CampusMapTab.addButton(faculty, 209, 350, "<b><u>Faculty Center</b></u>");
		add(faculty);

		// Horace Mann Hall
		JButton horace = new JButton();
		CampusMapTab.addButton(horace, 203, 403, "<b><u>Horace Mann Hall</b></u>");
		add(horace);

		// Thorp Residence Hall
		JButton thorp = new JButton();
		CampusMapTab.addButton(thorp, 175, 489, "<b><u>Thorp Residence Hall</b></u>");
		add(thorp);

		// President's House
		JButton president = new JButton();
		CampusMapTab.addButton(president, 62, 469, "<b><u>President's House</b></u>");
		add(president);

		// Sweet Residence Hall
		JButton sweet = new JButton();
		CampusMapTab.addButton(sweet, 129, 480, "<b><u>Sweet Residence Hall</b></u>");
		add(sweet);

		// Weber Residence Hall
		JButton weber = new JButton();
		CampusMapTab.addButton(weber, 183, 560, "<b><u>Weber Residence Hall</b></u>");
		add(weber);

		// Browne Residence Hall
		JButton browne = new JButton();
		CampusMapTab.addButton(browne, 137, 541, "<b><u>Browne Residence Hall</b></u>");
		add(browne);

		// Penfield Residence Hall
		JButton penfield = new JButton();
		CampusMapTab.addButton(penfield, 69, 568, "<b><u>Penfield Residence Hall</b></u>");
		add(penfield);

		// Willard Residence Hall
		JButton willard = new JButton();
		CampusMapTab.addButton(willard, 151, 612, "<b><u>Willard Residence Hall</b></u>");
		add(willard);
	}

	/**
	 * addButton -- creates button, sets location of button given ints, 
	 * and sets tool tip text to be String entered by user.
	 * @param button JButton entered
	 * @param x x-value position of button
	 * @param y y-value position of button
	 * @param phrase String used for text tool tip
	 */
	public static void addButton(JButton button, int x, int y, String phrase) {
		button.setLocation(x, y);
		button.setSize(new Dimension(20, 20));
		button.setToolTipText("<html>" + phrase + "</html>");
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
	}

	/**
	 * Draws CampusMapRIC.png & Gold.png image on panel
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image imgGold = new ImageIcon("Gold.png").getImage();
		Image img = new ImageIcon("CampusMapRIC.png").getImage();
		g.drawImage(imgGold, 0, 0, 1400, 728, null);
		g.drawImage(img, 0, 0, 1024, 728, null);
	}
}
