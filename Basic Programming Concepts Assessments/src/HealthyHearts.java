import java.util.Scanner;

public class HealthyHearts {
	
	final static int MAX_HEART_RATE = 220;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String readAge;
		int age = 0, maxRate = 0;
		boolean done = false;
		
		// Make sure the user enters a number
		do {
			try {
				System.out.println("What is your age?");
				readAge = in.nextLine();
				age = Integer.parseInt(readAge);
				// Not sure if this check needs to be here.
				if(age >= 0 && age < 221)
					done = true;
				else {
					System.out.println("Please enter a number between 0 and 220");
				}
			} catch (Exception e) {
				System.out.println("Please enter a number between 0 and 220");
			}
		} while(!done);
		
		maxRate = MAX_HEART_RATE - age;
		
		System.out.println("Your maximum heart rate should be " + maxRate +
		" beats per minute");
		System.out.println("Your target HR Zone is " + (maxRate * 50 / 100) + " - " +
		(maxRate * 85 / 100) + " beats per minute");
		
		in.close();
	}
}
