import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
	/* Program doesn't ask to change the number of dogBreeds 
	 * or to change the total percent to add up 100, but this
	 * is just good coding practice 
	 */
	final static int NUMBER_OF_DOG_BREEDS = 5;
	final static int TOTAL_PERCENT = 100;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String dogName;
		Random random = new Random();
		int[] percentArray = new int[NUMBER_OF_DOG_BREEDS];
		int percent, sum = 0;
		String[] dogBreeds = {"Chihuahua", "Husky", "German Sheperd", "Pug",
				"Bulldozer"};
		
		/* Get 5 random percentages of dogBreeds, and ensures that the sum of all
		 * these dog breed percentages add up 100%
		 */
		do {	
			sum = 0;
			for(int i = 0; i < percentArray.length; i++) {
				percent = random.nextInt(100) + 1;
				percentArray[i] = percent;
				sum += percent;		
			}
		} while(sum != TOTAL_PERCENT);
		
		// Prompt the user to enter the dog's name
		System.out.println("What is your dog's name?");
		dogName = in.nextLine();
		
		System.out.println("Well then, I have this highly reliable report on " +
		dogName + "'s prestigious background right here. \n");
		
		System.out.println(dogName + " is: \n");
		
		// Print the random 5 dog breeds and the percentages
		for(int i = 0; i < percentArray.length; i++) {
			System.out.println(percentArray[i] + "% " + dogBreeds[i]);
		}
		
		System.out.println("\nWow, that's QUITE the dog!");
		
		in.close();
	}
}
