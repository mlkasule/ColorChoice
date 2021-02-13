/**
 * A program that asks the user to enter the right color from the ones listed
 * @author Mark Kasule
 *
 */

import java.util.Scanner;
public class ColorChoice {

	public static void main(String[] args) {
		
		//declare variables
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which color of shirt do you want? Choose between pink, white, or black: ");
		String answer = input.nextLine();
		
		//check answer errors
		while(!answer.equals("pink") || !answer.equals("white") || !answer.equals("black")) {
			
			//ask the user again
			System.out.println("Ooops, we don't have a " + answer + " color in stock");
			System.out.print("Choose between pink, white or black: ");
			answer = input.nextLine();
			
			if(answer.equals("pink") || answer.equals("white") || answer.equals("black")) {
				
				//after user types right answer, display this next
				System.out.println("Your " + answer + " shirt will be shipped in 3 days \n\tThank you!! \n\tGoodbye!!");
				
			}
			System.exit(0);			//dont ask again the user, exit
			
		}
	}
}
