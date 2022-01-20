package hw4Q2JavaVariables;

/* I expect print outcome for 2 person, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. Follow indentation by Organizing the code and paste below. [Mark distribution (125) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 40, variable is declared and initialized, constructor is declared and initialized, method is i mplemented and initialized -- 15, organize code and other-- 30]*/
public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe test = new AboutMe();
		test.myName = "Imran Ahmad";
		test.myAge = 99;
		test.sex = 'M';
		test.myHeight = 5.10f;
		test.myMaintenanceBill = 575;
		test.usCitizen = true;
		test.myClassAttendence = 28;
		test.softwareVersion = 5.7;
		test.aboutMe();
		
		AboutMe test2 = new AboutMe();
		test2.myName = "Alex Wang";
		test2.myAge = 27;
		test2.sex = 'M';
		test2.myHeight = 5.10f;
		test2.myMaintenanceBill = 575;
		test2.usCitizen = true;
		test2.myClassAttendence = 28;
		test2.softwareVersion = 5.7;
		test2.aboutMe();
		
	}
}
