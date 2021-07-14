import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maxMoney, maxMoneyRolls, diceValue1, diceValue2;
		int dollars = 0, rolls = 0;
		Random dice1 = new Random();
		Random dice2 = new Random();
		boolean isValid = false;
		
		do {
			try {
				System.out.println("How many dollars do you have?");
				dollars = in.nextInt();
				
				isValid = true;
			}
			catch(Exception e) {
				System.out.println("Please enter a valid number next time.");
				break;
			}
			
		} while(!isValid);
		
		maxMoney = dollars;
		maxMoneyRolls = rolls;
		
		// roll the dice until player has no money left
		while(dollars > 0) {
			// simulates a value between 1 and 6 (inclusive)
			diceValue1 = dice1.nextInt(6) + 1;
			diceValue2 = dice2.nextInt(6) + 1;
			rolls++;
			
			if(diceValue1 + diceValue2 == 7) {
				dollars += 4;
				/* track the max money held by the player
				 * plus the rolls when the max money was held
				 */
				if(maxMoney < dollars) {
					maxMoney = dollars;
					maxMoneyRolls = rolls;
				}
			}
			else
				dollars -= 1;
		}
		
		// only print if the player entered a valid dollar amount
		if(isValid) {
			System.out.println("You are broke after " + rolls + " rolls.");
			System.out.println("You should have quit after " + maxMoneyRolls + " rolls when you had $"
				+ maxMoney);
		}
		in.close();
	}
}
