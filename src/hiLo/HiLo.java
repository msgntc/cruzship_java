package hiLo;

import java.util.Scanner;


public class HiLo {

	
		public static void main(String[] args) {
			
			System.out.println("Are you redy for the ultimate challenge?");

			Scanner scan = new Scanner(System.in);
			
			String playAgain = "";
			
			do {
				
				
				int theNumber = (int) (Math.random()*2000 +1); 
				theNumber = theNumber - 1000; 
				
				int guess = 0;
				int Tries = 0;
				
				while(guess != theNumber) {
					
					System.out.println("Guess a number between -1000 and 1000: ");
					guess = scan.nextInt();
					Tries = Tries + 1;
					
					if(guess < theNumber) {
						System.out.println(guess + " is too low. Try again.");
					} else if(guess > theNumber) {
						System.out.println(guess + " is too high. Try again.");
					} else {
						System.out.print(guess + " is correct.  You won with " + Tries);
						if(Tries==1) {
							System.out.println(" you have mastered the art of gussing numbers!");
						} else {
							System.out.println(" tries!");
						
						}
					}
				} 
				System.out.println("Would you like to play again (y/n)?");
				playAgain = scan.next();
				
			} while(playAgain.equalsIgnoreCase("y"));
			System.out.println("Thank you for playing!! Goodbye!");
			scan.close();
		}

	}