package hw3Q2JavaVariables;
// Testing
public class AboutMe {

//		I have attempted to apply initialization and declaration.

	public String myFovriteSport; // I have attempted to apply initialization and declaration.
	public String myFavoriteFood = "biryani"; // initialization
	public int myAge = 99;
	public String institutionName = "University at Buffalo";
	public double myHeight = 5.11;
	public char myFirstInitial = 'I';
	public char myLastInitial = 'A';
	public boolean hasPerfectJavaClassAttendence = true;
	public short myPercentage = 95;
	public long myPropertyValue = 29500000000l;
	public float myFavoriteNumber = 67.5f;

	public static void main(String[] args) {

		AboutMe aboutImran = new AboutMe();
		System.out.println("my Favorite Food :"+aboutImran.myFavoriteFood); 
		System.out.println("my Height :"+aboutImran.myHeight);
		System.out.println("my First Initial :"+aboutImran.myFirstInitial);
		System.out.println("my Last Initial :" +aboutImran.myLastInitial);
		System.out.println("has Perfect Java Class Attendence :"+aboutImran.hasPerfectJavaClassAttendence);
		System.out.println("my Percentage :"+aboutImran.myPercentage);
		System.out.println("my Property Value :"+aboutImran.myPropertyValue);
		System.out.println("my Favorite Number :"+aboutImran.myFavoriteNumber);

	}

}
