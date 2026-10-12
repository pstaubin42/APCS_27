/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int ans = (int)(1+1001*Math.random());

		System.out.println("Guess a number between 1 and 1000");
		int guess = sc.nextInt();

		while (guess != ans) {
			System.out.print("Nope. Try again, ");
			if (guess < ans) {
				System.out.println(" guess higher.");
			} else {
				System.out.println("guess lower");
			}
			guess = sc.nextInt();
		}
		System.out.println("You got it!");
		
	}
}
