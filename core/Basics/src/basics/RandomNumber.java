package basics;

import java.util.Random;

public class RandomNumber {

	public static int RollDice(int rolltimes) {
		int number = 1;
		for(int i=0; i<rolltimes;i++) {
			Random rn = new Random();
			number = 1+rn.nextInt(6);
		}
		return number;
	}
	
	public static void main(String[] args) {
		System.out.println(RollDice(1));
	}

}
