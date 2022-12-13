import java.util.Random;

public class Roulette {
	private int number;
	private String color;
	private int betAmount;
	private String betColor;
	private int betNum;

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

	public Roulette () {}



	public int rollNum(){
		Random rand = new Random();
		int intRandom = rand.nextInt(37);
		System.out.println(intRandom);
		return intRandom;
	}
	public String rollColor(){
		Random rand = new Random();
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
		System.out.println(this.color);
		return this.color;
	}

	public void bet(String betColor, int betAmount){
		this.betAmount = betAmount;
		this.betColor = betColor;
		if (betColor.equals(this.color)) {
			System.out.println("Winner!");
			if (this.betColor.equals("red") || this.betColor.equals("black")){
				this.betAmount = (betAmount * 2);
			}
			else if (this.betColor.equals("green")){
				this.betAmount = (betAmount * 35);
			}
		}
		else {
			System.out.println("Loser!");
			this.betAmount = 0 - betAmount;
		}
	}
	public void betNum(int betNum, int betAmount){
		this.betAmount = betAmount;
		this.betNum = betNum;
		if (betNum == this.number){
			System.out.println("Winner!");
			this.betAmount = betAmount * 35;
		}
		else {
			System.out.println("Loser!");
			this.betAmount = 0 - betAmount;
		}
	}

	public String getColor(){
		return this.color;
	}

	public int getBetAmount(){
		return this.betAmount;
	}
}
