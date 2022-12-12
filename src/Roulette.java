import java.util.Random;
import java.util.Scanner;
public class Roulette {
	private double number;
	private String color;
	private double balance;

	public Roulette(double number, String color){
		this.number = number;
		this.color = color;
	}

	public double deposit(double depositAmount){
		this.balance += depositAmount;
		return balance;
	}

	public String roll(){
		Random rand = new Random();
		int intRandom = rand.nextInt(37);
		int colorRandom = rand.nextInt(2);
		if (colorRandom == 1){
			this.color = "Black ";
			return color;
		}
		if (colorRandom == 2){
			this.color = "Red ";
			return color;
		}
		System.out.println(this.color + intRandom);
		return color + intRandom;
	}


}
