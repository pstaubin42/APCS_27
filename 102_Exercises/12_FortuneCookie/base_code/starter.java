/*
 *	Author: Pascal 
 *  Date: 9/22
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Press enter to generate your fourtune");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int rand = (int)(10*Math.random());

		if (rand == 1){

		} else if (rand == 2) {
			System.out.println("The best is yet to come.");
		} else if (rand == 3) {
			System.out.println("Patience will lead you to victory");
		} else if (rand == 4) {
			System.out.println("Someone from your past will lead you to victory.");
		} else if (rand == 5) {
			System.out.println("A loved one will be the key to rediscovery.");
		} else if (rand == 6) {
			System.out.println("Your strength will be your courage");
		} else if (rand == 7) {
			System.out.println("An unlit candle frightens no monkeys");
		} else if (rand == 8) {
			System.out.println("You will catch a fish");
		} else if (rand == 9) {
			System.out.println("You will pass Calc AB Chapter 2 test.");
		} else if (rand == 10) {
			System.out.println("Your courage will be no strength.");
		} else {
			System.out.println("Math random error.");
		}


	}
}
