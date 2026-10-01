/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Would you like to be a Wizzard, a Warrior, or a Rogue?");
		
		String input = sc.nextLine();
		input = input.toLowerCase();
		if (input.equals("wizzard")){
			System.out.println("You have chosen to be a Wizzard. You will cast spells and transform your enemies into frogs.");
		} else if (input.equals("warrior")){
			System.out.println("You have chosen to be a Warrior. Your greatest strength is your strength");
		} else if (input.equals("rouge")) {
			System.out.println("You have chosen to be a Rouge.");
		} else {
			System.out.println("You entered your choice wrong");
		}




	}
}
