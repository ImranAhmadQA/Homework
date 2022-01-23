package hw5Q3Constructor;

import hw5Q2Constructor.Computer;

public class StudentTest {

	public static void main(String[] args) {
		StudentTest StudentTest01 = new StudentTest(); //default constructor initialized
		// Here Dell is the argument.
		Computer StudentTest02 = new StudentTest("inputdata"); //Parameter Constructor is initialized.
		Computer StudentTest03 = new StudentTest("inputdata"); //Parameter Constructor is initialized.
		Computer StudentTest04 = new StudentTest("MacOS Mojave"); //Parameter Constructor is initialized.
		Computer StudentTest05 = new StudentTest("inputdata"); //Parameter Constructor is initialized.
		Computer StudentTest06 = new StudentTest("inputdata"); //Parameter Constructor is initialized.
		Computer StudentTest07 = new StudentTest("inputdata"); //Parameter Constructor is initialized.

	}

}
