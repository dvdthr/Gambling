import java.util.Random;
import java.util.Scanner;
public class Roulette {
	private int number;
	private String color;
	private double balance;
	final int WINMULTIPLIER = 2;
	final int GREENMULTIPLIER = 35;

	public Roulette(int number, String color){
		this.number = number;
		this.color = color;

	}
	public Roulette(int number){
		this.number = number;
	}

	public Roulette (String color){
		this.color = color;
	}

	public double deposit(double depositAmount){
		this.balance += depositAmount;
		return balance;
	}

	public void roll(){
		Random rand = new Random();
		int intRandom = rand.nextInt(37);
		int colorRandom = rand.nextInt(99);
		String black = "black";
		String red = "red";
		String green = "green";
		if (colorRandom >= 0 && colorRandom <=49){
			this.color = black;
		}
		else if (colorRandom <=98 && colorRandom > 49){
			this.color = red;
		}
		else if (colorRandom > 98) {
			this.color = green;
		}
		System.out.println(this.color + " " + intRandom);
	}

	public void Bet(int betAmount){

	}
}
