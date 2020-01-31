package lab9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JeannieMcCarthy
 *
 */
public class Lab9 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userChoice;
		//replaced with validator //boolean goAgain = false; 
		String goAgain = "yes";
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<Double> prices = new ArrayList<>();

		// Welcome user
		System.out.println("Welcome to Literally The Greatest!");
		System.out.println("What's your story?\n");
		// call a method to display menu
		Methods9.printMenu();

		do {
			// ask for user input
			System.out.println("Which book would you like to purchase?");
			userChoice = scnr.nextLine();
			
			//check if requested item exists
			if (Methods9.isOnMenu(userChoice)) {
				// add chosen title to ArrayList titles
				titles.add(userChoice);
				// method to getPrice of corresponding title, add to ArrayList prices
				prices.add(Methods9.getPrice(userChoice));
				System.out.println("Added " + userChoice + 
						" at $" + Methods9.getPrice(userChoice) + " to your cart.");
			}
			else {
				System.out.println("That item does not appear to be in stock.");
				continue;
			}
			// ask user if want another
			System.out.println("Would you like to continue shopping? y to continue, n to checkout:");
			goAgain = Validator.yesOrNo(scnr);
			//replaced with validator//goAgain = scnr.nextLine().toLowerCase().startsWith("y");
		}while (goAgain.equals("yes"));
		//replaced with validator//} while (goAgain);
		
		//End shopping, display cart
		System.out.println("Thanks for shopping with us! Here's your cart:\n");
		for (int i = 0; i < titles.size(); i++) {
			System.out.printf("%-27s| $%-5.2f  |\n", titles.get(i), prices.get(i));
			System.out.println(".....................................|");
		}
		//Display Average, Highest and Lowest
		System.out.print("Average price per item in order was: $");
		System.out.printf("%.2f \n", Methods9.getAvg(prices));
		System.out.print("The most expensive item in order was: $");
		System.out.printf("%.2f \n", prices.get(Methods9.getHighIndex(prices)));
		System.out.print("The least expensive item in order was: $");
		System.out.printf("%.2f \n", prices.get(Methods9.getLowIndex(prices)));

	}
}
