import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random computerRandom = new Random();
		String roundsToPlay, RPS, playAgain;
		int rounds = 0, computerChoice = 0, choice = 0, playerWins = 0, 
				computerWins = 0, ties = 0;
		boolean done = false, correctRounds = false, correctChoice = false, 
				correctPlayAgain = false;
			
		// Run program until user enters No after prompted to play again
		do {
			System.out.println("How many rounds would you like to play?");
			// Make sure user enters a number between 1 and 10
			do {
				try {
					roundsToPlay = in.nextLine();
					rounds = Integer.parseInt(roundsToPlay);
					
					if(rounds > 0 && rounds < 10)
						correctRounds = true;
					else {
						System.out.println("Please enter a number between 1 and 10");
					}
					
				} catch (Exception e) {
					System.out.println("Please enter a number between 1 and 10");
				}
			} while(!correctRounds);
			
			// Run the rounds
			for(int i = 0; i < rounds; i++) {
				
				// Correctly prompts user for RPS
				do {
					System.out.println("What is your choice among Rock, Paper and Scissors?");
					RPS = in.nextLine();
					
					// Assigns Rock = 1, Paper = 2, Scissors = 3
					if(RPS.equals("Rock")) {
						choice = 1;
						correctChoice = true;
					}
					else if(RPS.equals("Paper")) {
						choice = 2;
						correctChoice = true;
					}
					else if(RPS.equals("Scissors")) {
						choice = 3;
						correctChoice = true;
					}
					else {
						System.out.println("Please enter Rock, Paper, or Scissors");
						correctChoice = false;
					}
					
					
				} while(!correctChoice);
				
				
				computerChoice = computerRandom.nextInt(3) + 1;
				
				/* First if checks if player chooses rock and computer chooses scissors
				 * Otherwise since rock = 1, paper = 2, scissors = 3, and paper > rock, scissors > paper
				 * we know that the player having a higher choice will win
				 * Else if the player and computer choices are equal then it is a tie
				 * Else we can infer that the computer has a higher number than the player which means
				 * that the computer will win
				 */
				if(choice == 1 && computerChoice == 3) {
					playerWins++;
					System.out.println("User Win");
				}
				else if(choice > computerChoice) {
					playerWins++;
					System.out.println("User Win");
				}
				else if(choice == computerChoice) {
					ties++;
					System.out.println("Tie");
				}
				else {
					computerWins++;
					System.out.println("Computer Win");
				}
			}
			
			
			// Print the results of all the rounds
			System.out.println("User Wins: " + playerWins);
			System.out.println("Computer Wins: " + computerWins);
			System.out.println("Ties: " + ties);
			
			if(playerWins > computerWins)
				System.out.println("User Wins");
			else if(playerWins < computerWins)
				System.out.println("Computer Wins");
			else
				System.out.println("Tie");
			
			System.out.println("Would you like to play again?");
			// Continuously prompt user until player enters Yes or No
			do {
				playAgain = in.nextLine();
				
				if(playAgain.equals("No")) {
					done = true;
					correctPlayAgain = true;
				}
				else if(playAgain.equals("Yes"))
					correctPlayAgain = true;
				else {
					System.out.println("Please enter Yes or No.");
				}
			} while(!correctPlayAgain);
				
			// Set everything back to its original value if there is a next round
			if(!done) {
				correctRounds = false;
				correctChoice = false;
				correctPlayAgain = false;
				playerWins = 0;
				computerWins = 0;
				ties = 0;
			}
			
		} while(!done);	
		
		in.close();
	}
}
