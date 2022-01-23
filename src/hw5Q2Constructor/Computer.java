package hw5Q2Constructor;
		
public class Computer {
//Global variable or Class variable)
		public String brand; // variable are declared//
		public String model;
		public String operatingSystem;
		public int price;
		public char grade;
		public boolean madeInUSA;

//Default constructor (no argument constructor) declared//
		public Computer() {
			System.out.println("This default constructor is from the Computer class");

		}

//Parameterized Constructor 01 declared
		// Here brand is a parameter.
		public Computer(String brand) { // Local variable
			this.brand=brand;
			System.out.println("The Computer brand is " +brand);

		}
		//Parameterized 02 is declared
		public Computer(String brand, String model) { // Local variable
			this.brand=brand;
			this.model=model;
			System.out.println("The Computer model is" +model);
			
}

		
		}
		
