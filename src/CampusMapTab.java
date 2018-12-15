import java.awt.*;
import javax.swing.*;

/**
 * CampusMapTab -- Displays CampusMapRIC.png and allows user to hover over
 * buttons, which display the corresponding building info.
 * 
 * @author JMCoo
 *
 */
public class CampusMapTab extends JPanel {

	public CampusMapTab() {
		setLayout(null);

		// Sherlock Center on Disabilities Building
		JButton sherlock = new JButton();
		CampusMapTab.addButton(sherlock, 565, 25,
				"<b><u><font size=\"5\">Paul V. Sherlock Center on Disabilities</b></u></font><br><br>"
						+ "<b><font size=\"4\">Main Office</font></b><br>Paul V. Sherlock "
						+ "Center on Disabilities<br>Rhode Island College<br>600 Mt. Pleasant Avenue<br>"
						+ "Providence, RI 02908-1991<br><b><font size=\"4\">Reception</b></font><br>Voice: (401) 456-8072<br>"
						+ "TTY via RI Relay: 711 or (800) 745-5555<br>Spanish via RI Relay: 711 or (866) 355-9241<br>"
						+ "<font size=\"4\"><b> Fax</b></font><br>Main Office: (401) 456-8150"
						+ "<br>Education Advocate Program: (401) 456-1979 ");
		add(sherlock);

		// Building 8 - Outreach Programs
		JButton outReach = new JButton();
		CampusMapTab.addButton(outReach, 572, 60,
				"<b><u><font size=\"5\">Building 8 - Outreach Programs</b></u></font>"
						+ "<br><br><b><font size=\"4\">Address</font></b><br>600 Mt. Pleasant Avenue<br>Building 8"
						+ "<br>Providence, RI 02908<br>Phone: (401) 456-8698<br>Fax: (401) 456-8582");
		add(outReach);

		// Guardo Hall
		JButton guardo = new JButton();
		CampusMapTab.addButton(guardo, 572, 215, "<b><u><font size=\"5\">Guardo Hall</b></u></font>");
		add(guardo);

		// Kauffman Center
		JButton kauffman = new JButton();
		CampusMapTab.addButton(kauffman, 579, 291,
				"<b><u><font size=\"5\">Building 10 - " + "Joseph F. Kauffman Center</b></u></font>"
						+ "<br><br>Building 10 is today named the Joseph F. Kauffman Center, after <br>"
						+ "the College’s fourth president.  Recognized as one of the country’s most <br>"
						+ "respected experts on leadership in higher education, Kauffman served as the<br>"
						+ " Assistant to the President at Brandeis University before being appointed<br>"
						+ " President of Rhode Island College in 1968.");
		add(kauffman);

		// Welcome Center
		JButton welcome = new JButton();
		CampusMapTab.addButton(welcome, 658, 324, "<b><u><font size=\"5\">Welcome Center</b></u></font>"
				+ "<font size=\"4\"><b><br><br>Address: </b></font><br>612 Mt Pleasant Ave,<br> Providence, RI 02908");
		add(welcome);

		// Forman Center - Admissions
		JButton forman = new JButton();
		CampusMapTab.addButton(forman, 538, 207,
				"<b><u><font size=\"5\">Forman Center - Admissions</b></u></font><br><br><b><font size=\"4\">Phone:</font></b> 1-800-669-5760"
						+ "<br><b><font size=\"4\">Fax:</b></font> 1-401-456-8817<br><b><br><font size=\"4\">Email:</font></b> admissions@ric.edu or transfer@ric.edu<br><b><br"
						+ "<font size=\"4\">>Mailing Address:</font></b> "
						+ "<br>Office of Undergraduate Admissions<br>The Forman Center<br>Rhode Island College<br>Providence, RI 02908-1991	"
						+ "<br><br><b><font size=\"4\">Office Hours:</font></b>Academic Year: Monday – Friday, 8:30am – 4:30pm<br>Summer: Monday – Friday, 8:00am – 4;00pm");
		add(forman);

		// Yellow Cottage
		JButton yellow = new JButton();
		CampusMapTab.addButton(yellow, 542, 165,
				"<b><u><font size=\"5\">Yellow Cottage</b></u></font><br><br><b><font size=\"4\">Address:</font>"
						+ "</b><br> 600 Mt Pleasant Ave, Providence, RI 02908");
		add(yellow);

		// Recreation Center
		JButton recreation = new JButton();
		CampusMapTab.addButton(recreation, 520, 90, "<b><u><font size=\"5\">Recreation Center</b></u></font><br><br><b>"
				+ "August 25, 2018 - December 21, 2018 <font size=\"4\">Building Hours</font></b><br>Monday - Thursday     6:00 a.m. - 11:00 p.m.<br>Friday"
				+ "                       6:00 a.m. – 6:00 p.m.<br>Saturday                   10:00 a.m. – 2:00 p.m."
				+ "<br>Sunday                     4:00 p.m. – 10:00 p.m.<br><br>"
				+ "Individual areas within the Recreational Center have"
				+ "<br> different operational schedules, <br>please check below for the specific hours.<br>"
				+ "Activities will cease 30 minutes prior to the closing time "
				+ "<br>and the building will be shut down promptly at the designated time.<br>*For exceptions to this schedule, refer to Facility Closures Statement.");
		add(recreation);

		// Building 6 - Human Resources/Upward Bound
		JButton human = new JButton();
		CampusMapTab.addButton(human, 440, 75,
				"<b><u><font size=\"5\">Building 6 - Human Resources</b></u></font><br><b><font size = \"4\">"
						+ "Description: </font></b><br><br>**The Rhode Island College Upward Bound Program"
						+ "<br> is designed to instill in low-income, potential first-generation"
						+ "<br> college students the skills and motivation to complete high school"
						+ "<br> and to enter and graduate from college. <br><br>**The goal of Upward Bound is"
						+ "<br> to increase the high school and college graduation rates of program "
						+ "<br>participants. <br><br>**Upward Bound is committed to providing equal access and"
						+ "<br> opportunity to students from specific target high schools who meet "
						+ "<br>federal eligibility requirements.<br><br>**The program enhances the intellectual,"
						+ "<br> emotional, character and motivational development of each participant by"
						+ "<br> offering rigorous academic instruction, counseling, support services, "
						+ "<br>and an environment that recognizes individual differences and academic potential.");
		add(human);

		// Building 5 - Accounting/Payroll/Purchasing
		JButton account = new JButton();
		CampusMapTab.addButton(account, 460, 99,
				"<b><u><font size=\"5\">Building 5 - Accounting/Payroll/Purchasing</b></u></font>"
						+ "<br><br><font size=\"4\"><b>Payroll Manager: </b></font><br>Kathleen Gonsalves<br><br>"
						+ "<font size=\"4\"><b>Contact Info:</b> </font><br>(401) 456-8695(401) <br>456-8111 (fax)");
		add(account);

		// Building 4 - Bursar/Records
		JButton bursar = new JButton();
		CampusMapTab.addButton(bursar, 463, 145,
				"<b><u><font size=\"5\">Building 4 - Bursar/Records</b></u></font><br><br>"
						+ "<font size=\"4\"><b>Bursar: </b></font><br>Charlene Szczepanek<br><br><font size=\"4\"><b>Contact Info:</font></b><br>Bursar@ric.edu");
		add(bursar);

		// Building 3 - Financial Aid/Classrooms/Cafe
		JButton financial = new JButton();
		CampusMapTab.addButton(financial, 470, 177,
				"<b><u><font size=\"5\">Building 3 - Financial Aid/Classrooms/Cafe</b></u></font>"
						+ "<br><br><font size=\"4\"><b>Director: </font></b><br>Kenneth Ferus<br><br>"
						+ "<font size=\"4\"><b>Contact Info:</b> </font><br>keastwood@ric.edu<br><br>"
						+ "(401) 456-8033");
		add(financial);

		// Building 2 - Offices
		JButton offices = new JButton();
		CampusMapTab.addButton(offices, 473, 207,
				"<b><u><font size=\"5\">Building 2 - Mathematics and Computer Science Department</b></u></font>"
						+ "<br><br><font size=\"4\"><b>Chair: </b></font><br>Stephanie Costa<br>"
						+ "<font size=\"4\"><br><b>Contact Info:</b> </font><br>(401) 456-8038<br>"
						+ "(401) 456-4695 (fax)");
		add(offices);

		// Building 1 - Information Services
		JButton info = new JButton();
		CampusMapTab.addButton(info, 478, 257,
				"<b><u><font size=\"5\">Building 1 - Management Information Services</b></u></font><br><br>"
						+ "<font size=\"4\"><b>Director: </b></font><br>Bin Yu"
						+ "<font size=\"4\"><br><br><b>Contact Info:</b> </font><br>"
						+ "(401) 456-8050<br>fax: (401) 456-8199 ");
		add(info);

		// Cooperative Preschool
		JButton preschool = new JButton();
		CampusMapTab.addButton(preschool, 406, 240,
				"<b><u><font size=\"5\">Cooperative Preschool</b></u></font>"
						+ "<br><br><font size=\"4\"><b>Head Teacher:</font></b><br>"
						+ "Carol Shields<br><br><font size=\"4\"><b>Contact Info:</b>"
						+ "</font><br>(401) 456-8154<br>cshields1@ric.edu<br><br>***"
						+ "The co-op is open Monday through Friday from 7:45 a.m.<br>"
						+ " to 5 p.m. Use of the co-op’s facilities is limited to those<br>"
						+ " hours during which the parent is in class or fulfilling a class<br>"
						+ " obligation. The co-op follows the same academic calendar as the college.");
		add(preschool);

		// Whipple Hall
		JButton whipple = new JButton();
		CampusMapTab.addButton(whipple, 377, 240, "<b><u><font size=\"5\">Whipple Hall</b></u></font>"
				+ "<br><br><font size = \"4\"><b>Whipple Hall 102</font></b><br>Lab Phone:" + "<br>(401) 456-9613");
		add(whipple);

		// Nazarian Center for the Performing Arts
		JButton arts = new JButton();
		CampusMapTab.addButton(arts, 385, 288,
				"<b><u><font size=\"5\">Nazarian Center for the Performing Arts</b></u></font><br>"
						+ "<br><font size =\"4\"><b>Contact Info: </font></b><br> (401) 456-8194<br>"
						+ "(401) 456-8269 (fax)");

		add(arts);

		// Keefe Transportation Center
		JButton keefe = new JButton();
		CampusMapTab.addButton(keefe, 377, 395, "<b><u><font size=\"5\">Keefe Transportation Center</b></u></font>");
		add(keefe);

		// Roberts Hall
		JButton roberts = new JButton();
		CampusMapTab.addButton(roberts, 358, 327, "<b><u><font size=\"5\">Roberts Hall</b></u></font>" + " ");

		add(roberts);

		// ALEX AND ANI Hall
		JButton alex = new JButton();
		CampusMapTab.addButton(alex, 305, 313, "<b><u><font size=\"5\">ALEX AND ANI Hall--Art Center</b></u></font>");
		add(alex);

		// Alger Hall
		JButton alger = new JButton();
		CampusMapTab.addButton(alger, 298, 248, "<b><u><font size=\"5\">Alger Hall</b></u></font>");
		add(alger);

		// Craig-Lee Hall
		JButton craig = new JButton();
		CampusMapTab.addButton(craig, 256, 259, "<b><u><font size=\"5\">Craig-Lee Hall</b></u></font>");
		add(craig);

		// Clarke Science Building
		JButton clarke = new JButton();
		CampusMapTab.addButton(clarke, 256, 200, "<b><u><font size=\"5\">Clarke Science Building</b></u></font>");
		add(clarke);

		// Fogarty Life Science Building - School of Nursing
		JButton fogarty = new JButton();
		CampusMapTab.addButton(fogarty, 226, 140,
				"<b><u><font size=\"5\">Fogarty Life Science Building - School of Nursing</b></u></font>");
		add(fogarty);

		// Henry Barnard Laboratory School
		JButton henry = new JButton();
		CampusMapTab.addButton(henry, 244, 350,
				"<b><u><font size=\"5\">Henry Barnard Laboratory School</b></u></font><br>"
						+ "<font size=\"4\"><b>Address: </b></font><br> 600 Mt. Pleasant Avenue"
						+ "<br><font size=\"4\"><b>Telephone: </b></font>" + "<br>(401) 456-8127");
		add(henry);

		// Adams Library
		JButton library = new JButton();
		CampusMapTab.addButton(library, 205, 214, "<b><u><font size=\"5\">Adams Library</b></u></font>");
		add(library);

		// Gaige Hall
		JButton gaige = new JButton();
		CampusMapTab.addButton(gaige, 145, 247, "<b><u><font size=\"5\">Gaige Hall</b></u></font>");
		add(gaige);

		// Building 27 - Storage Building
		JButton storage = new JButton();
		CampusMapTab.addButton(storage, 56, 188, "<b><u><font size=\"5\">Building 27 - Storage Building</b></u></font>"
				+ "<br><br><b><font size=\"4\">Hours of Operation:</b></font>" + "<br>7:00a.m - 3:00p.m.");
		add(storage);

		// Building 26 - Student - Athlete Success Center
		JButton athlete = new JButton();
		CampusMapTab.addButton(athlete, 83, 222,
				"<b><u><font size=\"5\">Building 26 - Student - Athlete Success Center</b></u></font><br><br>"
						+ "<b><font size=\"4\"> Hours: </b><br>Sunday: 3 - 7 p.m.<br>"
						+ "Monday - Thursday: 10:00 a.m. - 8 p.m.<br>"
						+ "Friday: By appointment only<br>Saturday: Closed");
		add(athlete);

		// Physical Plant Building - College Receiving
		JButton plant = new JButton();
		CampusMapTab.addButton(plant, 51, 274,
				"<b><u><font size=\"5\">Physical Plant Building - College Receiving</b></u></font>");
		add(plant);

		// Building 30 - English Department/Offices
		JButton english = new JButton();
		CampusMapTab.addButton(english, 22, 293,
				"<b><u><font size=\"5\">English Department/Offices</b></u></font>"
						+ "<br><br><b><font size=\"4\">Chair: </font></b><br>Daniel Scott<br><br>"
						+ "<b><font size=\"4\">Assistant Chair:</b></font><br>Stephen Brown"
						+ "<br><br><b><font size=\"4\">Contact Info: </b></font><br> " + "(401) 456-8028");
		add(english);

		// The Murray Center - Health, Physical Education, Athletics
		JButton murray = new JButton();
		CampusMapTab.addButton(murray, 104, 281,
				"<b><u><font size=\"5\">The Murray Center - Health, Physical Education, Athletics</b></u></font>");
		add(murray);

		// Student Union
		JButton union = new JButton();
		CampusMapTab.addButton(union, 164, 311,
				"<b><u><font size=\"5\">Student Union</b></u></font>"
						+ "<br><br><font size=\"4\"><b>Director:</font></b><br>Kristen K. Salemi<br>"
						+ "<font size=\"4\"><b>Contact Info:</b></font><br>(401) 456-8034");
		add(union);

		// Donovan Dining Center
		JButton donovan = new JButton();
		CampusMapTab.addButton(donovan, 189, 330,
				"<b><u><font size=\"5\">Donovan Dining Center</b></u></font><br><br>"
						+ "<font size=\"4\"><b>Hours of Operation: </b></font><br>"
						+ "Mon-Fri 6:30AM-7:00PM<br>Sat-Sun Closed<br><br><font size=\"4\"><b>"
						+ "Meal Zones</b></font><br>Mon-Fri<br>Breakfast: 6:30 AM - 10:30 AM<br>"
						+ "Lunch: 10:31 AM - 3:30 PM<br>Dinner: 3:31 PM - 7:00 PM<br>" + "SAT-SUN<br>N / A");
		add(donovan);

		// Faculty Center
		JButton faculty = new JButton();
		CampusMapTab.addButton(faculty, 209, 350,
				"<b><u><font size=\"5\">Faculty Center for Teaching and Learning</b></u></font>"
						+ "<br><br><font size=\"4\"><b>Director: </b></font><br>Chris Marco<br><br><font size=\"4\"><b>"
						+ "Contact Info: </b></font>cmarco@ric.edu<br>(401) 456-9984<br>" + "Email: fctl@ric.edu");
		add(faculty);

		// Horace Mann Hall
		JButton horace = new JButton();
		CampusMapTab.addButton(horace, 203, 403, "<b><u><font size=\"5\">Horace Mann Hall</b></u></font>");
		add(horace);

		// Thorp Residence Hall
		JButton thorp = new JButton();
		CampusMapTab.addButton(thorp, 175, 489,
				"<b><u><font size=\"5\">Thorp Residence Hall</b></u></font>"
						+ "<br><br>Thorp Hall is a co-educational upperclassmen hall designed<br>"
						+ " in a suite style housing 144 students. Each suite offers eight<br>"
						+ " single rooms off of a common living room area. Eight students share<br>"
						+ " a bathroom with 2 sinks, 2 showers and 2 toilets. Each suite connects<br>"
						+ " to a suite of the same sex through the bathroom.");
		add(thorp);

		// President's House
		JButton president = new JButton();
		CampusMapTab.addButton(president, 62, 469,
				"<b><u><font size=\"5\">President's House</b></u></font><br><br>"
						+ "President<br>Frank Sánchez<br>President@ric.edu<br><br><b><font size=\"4\">Contact Info: </b><br></font>"
						+ "(401) 456-8100<br>(401) 456-8287 (fax)<br><br><b><font size=\"4\">Address:</font></b>"
						+ "<br>255 Fruit Hill Ave,<br>North Providence, <br>RI 02911");
		add(president);

		// Sweet Residence Hall
		JButton sweet = new JButton();
		CampusMapTab.addButton(sweet, 129, 480,
				"<b><u><font size=\"5\">Sweet Residence Hall</b></u></font><br><br>"
						+ "Sweet Hall is a co-educational freshmen hall designed in a more traditional<br>"
						+ " style of hall housing 210 students. There are five floors consisting mostly<br>"
						+ " of double rooms, with nine triples. Groups of three rooms share a common<br>"
						+ " bathroom area which has 2 sinks, 1 or 2 showers and 1 or 2 toilet stalls<br>"
						+ " depending on the set-up. Each of the floors has a central lounge<br>"
						+ " area used for various programs and activities.");
		add(sweet);

		// Weber Residence Hall
		JButton weber = new JButton();
		CampusMapTab.addButton(weber, 183, 560,
				"<b><u><font size=\"5\">Weber Residence Hall</b></u></font><br><br>"
						+ "Weber Hall is a co-educational upperclassmen hall designed in a<br>"
						+ " suite style housing 180 students. Each suite offers ten single<br>"
						+ " rooms off of a common living room area. Ten students share a<br>"
						+ " bathroom with 2 or 3 sinks, 2 showers and 2 toilets. Each suite <br>"
						+ "connects to another suite through a small hallway.");
		add(weber);

		// Browne Residence Hall
		JButton browne = new JButton();
		CampusMapTab.addButton(browne, 137, 541, "<b><u><font size=\"5\">Browne Residence Hall</b></u></font><br>"
				+ "<br>Browne Hall is a co-educational upperclassmen and graduate<br>"
				+ " student hall designed in a suite style housing 156 <br>"
				+ "students. Each suite offers twelve single rooms off of a large<br>"
				+ " common living room area. There are two suites per floor. Twelve students<br>"
				+ " share a bathroom with 3 sinks, 2 showers and 2 toilets. Browne is our<br>"
				+ " only high-rise residence hall with six floors that are accessible<br>" + " by two elevators.");
		add(browne);

		// Penfield Residence Hall
		JButton penfield = new JButton();
		CampusMapTab.addButton(penfield, 69, 568, "<b><u><font size=\"5\">Penfield Residence Hall</b></u></font>"
				+ "<br><br>Penfield Hall houses 366 students in a mix of suite <br>"
				+ "and apartment-style units. Each unit houses four students in <br>both"
				+ " single and double occupancy rooms. The single<br> "
				+ "rooms are reserved for upperclassmen and the double<br>"
				+ " rooms are reserved for freshmen. There is a common laundry<br>" + " facility and elevator access.");
		add(penfield);

		// Willard Residence Hall
		JButton willard = new JButton();
		CampusMapTab.addButton(willard, 151, 612, "<b><u><font size=\"5\">Willard Residence Hall</b></u></font>"
				+ "<br><br>Willard Hall is a co-educational <br>freshmen hall designed in a suite<br> style housing 140 students. "
				+ "Each suite, containing single<br> and double rooms, is accessible from an<br> outside courtyard area. Each pair "
				+ "<br>of single and double rooms share a common bathroom" + "<br> with a shower, sink and toilet.");
		add(willard);
	}

	/**
	 * addButton -- creates button, sets location of button given ints, and sets
	 * tool tip text to be String entered by user.
	 * 
	 * @param button
	 *            JButton entered
	 * @param x
	 *            x-value position of button
	 * @param y
	 *            y-value position of button
	 * @param phrase
	 *            String used for text tool tip
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
		// g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}
}
