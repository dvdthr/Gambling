import java.util.Random;
import java.util.Scanner;
public class RouletteGame {
	public static void main(String[] args) {
		System.out.print("Welcome to Roulette! Please enter a starting balance: ");
		Scanner input = new Scanner(System.in);
		int startingBalance = input.nextInt();
		int betRound = 0;
		String choice = "";


		System.out.println("You have $" + startingBalance);
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
			Roulette roulette = new Roulette(userColor);

			System.out.println("How much do you want to bet?");
			betRound = input.nextInt();
			if (betRound > startingBalance) {
				while (betRound > startingBalance) {
					System.out.println("Available balance: " + startingBalance + "You don't have enough money! Please enter a lower value.");
					betRound = input.nextInt();
				}
			}

			System.out.println("Rolling.");
			roulette.roll();
			if (color.eqa){
				System.out.println();


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