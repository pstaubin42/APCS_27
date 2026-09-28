/*
 *	Author:  Pascal
 *  Date: 9/22
*/ 

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num = (int)(1001*Math.random());
		System.out.println("Guess an integer between 0 and 1000");
		int guess = sc.nextInt();

		if (guess  == num){
			System.out.println("WOW! you got it!!!!");
		} else {
			System.out.println("You did not guess it. It was " + num);
		}
	}
}
