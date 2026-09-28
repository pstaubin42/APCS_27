/*
 *	Author:  Pascal
 *  Date:  9/23
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Guess a random number 1-1000");
		int num = (int)(1001*Math.random());
		int guess = sc.nextInt();
		int off = Math.max(num, guess) - Math.min(num, guess);


		if (guess==num){
			System.out.println("WOW you got it!!!");

		} else if (guess < num) {
			System.out.println("Your guess was " + off + " less than the actual number, " + num);
		} else if (guess > num) {
			System.out.println("Your guess was " + off + " more than the actual number, " + num);
		}
	}
}
