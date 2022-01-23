package hw5Q3Constructor;

public class Student {

	//Global variable or Class variable)
			public String stName; // variable are declared//
			public int stID;
			public char sex;
			public boolean isProgrammer;
			public float grade;
	
			//Default constructor (no argument constructor) declared//
			public Student() {
				System.out.println("This default constructor is from the Student class");
			}
				//Parameterized Constructor 01 declared
				public Student(String stName) { // Local variable
					this.stName=stName;
					System.out.println("The student name is " +stName);
	}

}
