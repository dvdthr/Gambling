import java.util.Random;
import java.util.Scanner;
public class RouletteGame {
	public static void main(String[] args) {
		System.out.print("How much money would you like to desposit? $");
		Scanner input = new Scanner(System.in);
		int startingBalance = input.nextInt();
		int betRound = 0;
		String choice = "";
		int counter = 0;
		Roulette casino = new Roulette();
		String yesOrNo = "";
		while (!(yesOrNo.equals("yes"))) {
			while (choice.equals("")) {
				System.out.println("Would you like to bet on a color or a number this round?");
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

			if (choice.equals("color")) {
				System.out.println("Which color do you want to bet on? (red, black, green)");
				String userColor = input.next();
				userColor.toLowerCase();
				System.out.println("How much do you want to bet?");
				betRound = input.nextInt();
				if (betRound > startingBalance) {
					while (betRound > startingBalance) {
						System.out.println("Available balance: " + startingBalance + " You don't have enough money! Please enter a lower value.");
						betRound = input.nextInt();
					}
				}
				System.out.println("Rolling.");
				casino.rollColor();
				casino.bet(userColor, betRound);
				startingBalance = startingBalance + casino.getBetAmount();
				System.out.println("Remaining balance: $" + startingBalance);
			} else if (choice.equals("number")) {
				System.out.println("Please select a number, 0-36");
				int userNumber = input.nextInt();
				System.out.println("How much do you want to bet?");
				betRound = input.nextInt();
				if (betRound > startingBalance) {
					while (betRound > startingBalance) {
						System.out.println("Available balance: " + startingBalance + " You don't have enough money! Please enter a lower value.");
						betRound = input.nextInt();
					}
				}
				System.out.println("Rolling.");
				casino.rollNum();
				casino.betNum(userNumber, betRound);
				startingBalance = startingBalance + casino.getBetAmount();
				System.out.println("Remaining balance: $" + startingBalance);
			}
			counter++;
			System.out.println("Would you like to cash out?");
			yesOrNo = input.next();
			choice = "";
		}
		System.out.println("Cashed out with $" + startingBalance + " after round " + counter);
	}
}

/* have user enter deposit amount
* as them whether they want to bet on a color or a number
* having a running count of their balance
* have methods to add money
* have method to cash out
* have counter of money stolen
* have method for percentage of games won or lost*/