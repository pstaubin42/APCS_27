/*
 *	Author: Pascal
 *  Date: 9/23
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int value = (int)(3*Math.random());
		String ans = "placeholder. Error if printed";
		String hint1 = "placeholder. Error if printed";
		String hint2 = "placeholder. Error if printed";
		if (value == 0) {
			ans = "trout";
			hint1 = "This is a fish";
			hint2 = "This fish lives in cool mountain streams";
		} else if (value == 1){
			ans = "football";
			hint1 = "This is a piece of sports equipment that is thrown";
			hint2 = "It has a bit of an eliptical shape";
		} else if (value == 2) {
			ans = "mercury";
			hint1 = "This is a small planet";
			hint2 = "Guess a little closer to the center of the Solar System.";
		}

		System.out.println("Input your guess for the correct planet!");
		System.out.println(hint1);
		String guess = sc.nextLine();
		guess = guess.toLowerCase();

		boolean check = ans.equals(guess);

		System.out.println(check);


		if (check) {	
			System.out.print("That's correct! Great Job!");
		} else  {
			System.out.print("Nope! Try again. ");
			System.out.println(hint2);
			guess = sc.nextLine();

			boolean check2 = guess.equals(ans);
			if (check2) {
				System.out.println("That's correct! Great Job!");
			} else {
				System.out.println("Wrong again.");
			}
		}



	}
}
