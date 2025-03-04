package secretMessege;

import java.util.Scanner;

public class SecretMessege {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			 
		
		String choice = "y";
		 while (choice.equalsIgnoreCase("y")) {
			 
		System.out.println("Enter a message to encode or decode:");
		String message = sc.nextLine();
		
		
		String output = "";
		
		
		System .out.println("Enter a secret key (25 to - 25):");
        int keyVal = Integer.parseInt(sc.nextLine());
        char key = (char) keyVal;
        
	
		     for(int i = message.length()-1; i >= 0; i--) {
		    	output += message.charAt(i);
		    	
		   }
			for( int i = 0; i < message.length(); i++ )  {
             char input = message.charAt(i);
             if (input >= 'A' && input <= 'Z')
             {
            	 input += key;
            	 if (input > 'Z')
            		 input -= 26;
            	 if (input < 'A')
            		 input += 26;
         	 
             }
             else if (input >= 'a' && input <= 'z')
             {
            	 input += key;
            	 if (input > 'z')
            		 input -= 26;
            	 if (input < 'a')
            		 input += 26;
             }
             else if (input > '0' && input <= '9')
             {
            	 input += (keyVal % 10);
            	 if (input > '9')
            		 input -= 10;
            	 if (input < '0')
            		 input += 10;
             }
             output += input;
	 		}
		 
		 
			System.out.println(output);
		 System.out.print("Continue? (y/n): ");
	     choice = sc.nextLine();
		 }
		System.out.println("thank you for playing");
		 
			sc.close();
		  
		 
	}
	

}
