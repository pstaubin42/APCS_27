/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();

		System.out.println("What is your age?");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("What is your birth month?");
		String month = sc.nextLine();

		System.out.println("What day of the month is your Birthday on?");
		int day = sc.nextInt();
		sc.nextLine();

		System.out.println("What year were you born in?");
		int year = sc.nextInt();
		sc.nextLine();

		System.out.println("How much is a buck fifty?");
		String ans = sc.nextLine();



		String feedback;

		if (ans == "$1.50"); {
			feedback = "you know how much a buck fifty is.";

		}
		else {
			feedback = "you don't know how much a buck fifty is.";
		}

		

		System.out.print("Your name is " + name + " and you are " + age + " years old. ");
		System.out.print("You were born on " + month + " " + day + ", " + year + ", and " + feedback);
	}
}
