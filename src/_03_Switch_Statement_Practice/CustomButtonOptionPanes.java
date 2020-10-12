package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(input) {
		case 0:
			System.out.println("You love to sleep in");
		    break;
		case 1:
			System.out.println("You're very productive");
			break;
		case 2:
			System.out.println("You're a cool person");
			break;
		case 3:
			System.out.println("You love tall mountains and windy weather");
			break;
		case 4:
			System.out.println("You are very nostalgic");
			break;
		case 5:
			System.out.println("You love barbecques and having fun in general");
			break;
		case 6:
			System.out.println("You love to watch cartoons in the morning");
			break;
		}
	}
}
