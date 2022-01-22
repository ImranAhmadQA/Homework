package hw5Q2Constructor;

public class ComputerTest {
public static void main(String[] args) {
	Computer computer01 = new Computer(); //default constructor initialized
	// Here Dell is the argument.
	Computer computer02 = new Computer("Apple"); //Parameter Constructor is initialized.
	Computer computer03 = new Computer("MacAir"); //Parameter Constructor is initialized.
	Computer computer04 = new Computer("MacOS Mojave"); //Parameter Constructor is initialized.
	Computer computer05 = new Computer("800.00"); //Parameter Constructor is initialized.
	Computer computer06 = new Computer("A"); //Parameter Constructor is initialized.
	Computer computer07 = new Computer("false"); //Parameter Constructor is initialized.
}
}
