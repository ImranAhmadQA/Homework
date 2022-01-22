package hw4Q2JavaVariables;
/*Create another class AboutMeTest. Instantiate AboutMe class under main method. Initialize variables and call the method by object. I expect print outcome for 2 person, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. Follow indentation by Organizing the code and paste below. [Mark distribution (125) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 40, variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized -- 15, organize code and other-- 30]*/

public class AboutMe {
	// Specified variables that are declared.
	public String myName;
	public int myAge;
	public char sex;
	public float myHeight;
	public short myMaintenanceBill;
	public boolean usCitizen;
	public long myJackpotLottery;
	public byte myClassAttendence;
	public double softwareVersion;

	// A constructor is define//
	public AboutMe() {
		System.out.println("This is all about me:");
	}

	// This is a method//
	public void aboutMe() {
		System.out.println("my name is: " + myName + "\nmy age is: " + myAge + "\nsex " + sex + "\nmyHeight is: "
				+ myHeight + "\nmyMaintenanceBill: " + myMaintenanceBill + "\nusCitizen: " + usCitizen
				+ "\nmyJackpotLottery: " + myJackpotLottery + "\nmyClassAttendance: " + myClassAttendence
				+ "\nmySoftwareVersion: " + softwareVersion);
	}
}
