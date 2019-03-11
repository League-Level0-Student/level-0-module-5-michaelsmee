import java.util.Random;

import javax.swing.JOptionPane;

public class level0skillpractice {
	public static void main(String[] args) {

		level0skillpractice skills = new level0skillpractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dime = JOptionPane.showInputDialog("How many dimes do you have");
		{
			int x;
			int y = Integer.parseInt(dime);
			x = y * 10;
			JOptionPane.showMessageDialog(null, "you have" + x + " cents");
		}

		// Tell them how many cents they have (hint multiply by 10)

		// Ask the user how tall they are (inches)
		String tall = JOptionPane.showInputDialog("How Tall are you?");
		{
			int t = Integer.parseInt(tall);
			if (t < 36) {
				JOptionPane.showMessageDialog(null, "You need to eat more wheaties!!!!!!!!");
			} else {
				JOptionPane.showMessageDialog(null, "keep up the good work");
			}
		}

		// If they are shorter than 36 inches, tell them to eat their Wheaties

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 31; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		Random rand = new Random();
		int i = rand.nextInt(20);
		System.out.println(i);
		// Get another random number that is less than 10 and print it to the console
		Random randy = new Random();
		int x = rand.nextInt(10);
		System.out.println(x);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		int z = i - x;
		JOptionPane.showMessageDialog(null, z);
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
		{

			if (city.equalsIgnoreCase("San Diego")) {
				JOptionPane.showMessageDialog(null, "you live in the best city");
			} else {
				JOptionPane.showMessageDialog(null, "move to san diego!!!!");

			}
		}
		// If they answered "San Diego", tell them they live in America's Finest City

		// Otherwise, tell them to move to San Diego
		String cars = JOptionPane.showInputDialog("How many cars do you have?");
		{

			int c = Integer.parseInt(cars);
			int p = c * 4;
			if (c == 0) {
				JOptionPane.showMessageDialog(null, "I bet you people only use public transportation");
			} else if (c == 1) {
				String caars = JOptionPane.showInputDialog("What model?");
			} else {
				JOptionPane.showMessageDialog(null, "you have" + p + " tires in your garage");

			}
		}
	}
	// Create a variable - cars - and initialize it to the number of cars your
	// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
	// public transportation."

	// If there is 1 car, use a pop-up to display the make/model of the car

	// If there is more than 1 car, use a pop-up to display how many wheels the //
	// cars have between them.

	void skill5() { // In a pop-up, ask the user for the name of their school
		String o = JOptionPane.showInputDialog("what school do you go to?");
		int z = Integer.parseInt(o);
		JOptionPane.showMessageDialog(null, z + " is a fantastic school");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.

	}
}