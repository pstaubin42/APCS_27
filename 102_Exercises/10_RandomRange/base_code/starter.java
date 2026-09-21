/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer to be the lower end of your range");
		int low = sc.nextInt();
		System.out.println("Enter an integer to be the upper integer of your range");
		int upp = sc.nextInt();
		int x = upp - low;

		System.out.println("");
		System.out.println("Here are five random numbers in your range.");
		System.out.println((int)(low+(x*Math.random())));
		System.out.println((int)(low+(x*Math.random())));
		System.out.println((int)(low+(x*Math.random())));
		System.out.println((int)(low+(x*Math.random())));
		System.out.println((int)(low+(x*Math.random())));

	}
}
