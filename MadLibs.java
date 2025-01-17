package game;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		

			
			System.out.println("are you ready?" + "\n");
			
			String color = "";
			System.out.println("Enter a color: ");
			color = scan.next();
			
			String pasttenseverb = "";
			System.out.println("Enter a past tense verb: ");
			pasttenseverb = scan.next();
			
			String adjective = "";
			System.out.println("Enter a adjective: ");
			adjective = scan.next();
			
			String noun = "";
			System.out.println("Enter a noun: ");
			noun = scan.next();
			
			System.out.print("The " + color + " dragon " + pasttenseverb +
					" at the " + adjective);
			System.out.println(" night, who rode in on a sturdy, giant "
					+ noun + ".");
			
			
			
	
		
		
		System.out.println("\n" + "Thank you for playing madlibs.");
		scan.close();
		
		
	}
		

}
