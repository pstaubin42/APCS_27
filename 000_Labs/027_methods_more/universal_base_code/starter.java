/*
 *	Author:  Pascal St Aubin
 *  Date: 10/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		

		System.out.println("=========ATM========= \n");

		System.out.println("Open a bank account(1), display info(2), check the balance(3) or end (4)?");
		int choose = sc.nextInt();
		sc.nextLine();
		
		boolean accountCre = false;
		while (choose != 4) {
		
			if (choose == 1) {


				System.out.println("Create a bank account! Enter your name or enter to leave blank");
				String user = sc.nextLine();
				System.out.println("Initial deposit? Enter or enter 0 for no deposit");
				double initDep = sc.nextDouble();
		
				if (user.equals("") && !(initDep > 0)) {
					BankAccount a = new BankAccount();

				} else if (!user.equals("") && !(initDep > 0)) {
					BankAccount a = new BankAccount(user);
				} else if (!user.equals("") && (initDep > 0)) {
					BankAccount a = new BankAccount(user, initDep);
				} else {
					BankAccount a = new BankAccount();
				}

				System.out.println("Account created. \n");
				System.out.println("Display info(2), check balance(3), or end(4)?");
				choose = sc.nextInt();
				sc.nextLine();

				if (choose == 2) {
					a.displayInfo();
				} else if (choose == 3) {
					a.checkBalance();
				} else if (choose == 4) {
					break;
				} else {
					System.out.println("Wrong input. try again");
					System.out.println("Display info(2), check balance(3), or end(4)?");
					choose = sc.nextInt();
					sc.nextLine();
				}
				




			} else if (choose == 2) {
				System.out.println("No account to check balance");
				System.out.println("Open a bank account(1), display info(2), check balance(3) or end (4)?");
				choose = sc.nextInt();
				sc.nextLine();
			} else if (choose == 3) {
				System.out.println("No bank account to check.");
				System.out.println("Open a bank account(1), display info(2), check balance(3) or end (4)?");
				choose = sc.nextInt();
				sc.nextLine();
			} else {
				System.out.println("wrong input, try again \n");
				System.out.println("Open a bank account(1), display info(2), check balance(3) or end (4)?");
				choose = sc.nextInt();
				sc.nextLine();
			}



			




		}

		

	}


}
