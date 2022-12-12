import java.util.Scanner;
public class RouletteGame {
	public static void main(String[] args) {
		System.out.print("Welcome to Roulette! Please enter a starting balance: ");
		Scanner input = new Scanner(System.in);
		int startingBalance = input.nextInt();
		String choice = "";

		System.out.println("You have $" + startingBalance);
		while (choice.equals("")) {
			System.out.println("Would you like to vote on a color or a number this round?");
			String cOrN = input.next();
			cOrN.toLowerCase();

			if (cOrN.equals("color")) {
				System.out.println("You have selected: Color");
				choice = "color";

			} else if (cOrN.equals("number")) {
				System.out.println("You have selected: Number");
				choice = "number";

			} else {
				System.out.println("What you entered was not an option.");
				choice = "";

			}
		}


	}
}
/* have user enter deposit amount
* as them whether they want to bet on a color or a number
* having a running count of their balance
* have methods to add money
* have method to cash out
* have counter of money stolen
* have method for percentage of games won or lost*/