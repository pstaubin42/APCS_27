/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int money = 100;
		System.out.println("You have '$100' to 'gamble'."); 
		System.out.println("Would you like to play the slots? (y/n)");
		String decis = sc.nextLine();
		boolean keepGambling = decis.equals("y") || decis.equals("Y") || decis.equals("Yes") || decis.equals("yes");
		boolean stopGambling = decis.equals("n") || decis.equals("N") || decis.equals("no") || decis.equals("No");

		while (!keepGambling && !stopGambling) {
				
				System.out.println(stopGambling);
				System.out.println(keepGambling);
				System.out.println("Incorrect input, try again.");
				decis = sc.nextLine();
				
			}

		int num1;
		int num2;
		int num3;

		int bet = 0;

		
		while (keepGambling && money > 0) {
			System.out.println("How much do you want to bet?");
			bet = sc.nextInt();

			bet = Math.min(bet, money);
			sc.nextLine();
			
			num1 = (int)(10*Math.random());
			num2 = (int)(10*Math.random());
			num3 = (int)(10*Math.random());

			System.out.println("-------------");
			System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
			System.out.println("-------------");

			boolean duble = (num1 == num2) || (num2 == num3) || (num3 == num1);
			boolean notTrip= !((num2 == num1) && (num1 == num3));
			boolean trip = (num2 == num1) && (num1 == num3);
			boolean luckyNum7 = trip && num1 == 7;

			if (duble && notTrip ) {
				money = bet + money;
				System.out.println("Doubled your bet!! You now have $" + money);
			} else if (trip) {
				bet = bet*2;
				money = bet + money;
				System.out.println("Tripled your bet!! You now have $" + money);
			} else if (luckyNum7) {
				bet = bet*4;
				money = money + bet;
				System.out.println("LUCKY NUMBER 7!!!! 5x YOUR BET!!! You now have $" + money);
			} else {
				money = money - bet;
				System.out.println("You lost your bet. You have $" + money);
			}

			System.out.println("Would you like to spin again?");
			decis = sc.nextLine();
			while (!(keepGambling || stopGambling)) {
				System.out.println("Incorrect input, type again.");
				decis = sc.nextLine();
			}
		}
		
		if (decis.equals("y")) {
			System.out.println("No more spins, out of money");
		} else {
			System.out.println("Thanks for playing!");
		}
		


	}
}
