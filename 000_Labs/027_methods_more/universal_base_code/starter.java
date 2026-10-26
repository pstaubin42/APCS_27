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

		BankAccount x = new BankAccount("Pascal", 205.0, false);
		BankAccount y = new BankAccount("Joe", 500, true);
		BankAccount z = new BankAccount("Lisa", 200, true);
		BankAccount f = new BankAccount("Mike", false);

		System.out.println("=========ATM========= \n");



		System.out.println("Create a bank account! Enter your name or enter to leave blank");
		String user = sc.nextLine();
		System.out.println("Initial deposit? ");
		double initDep = sc.nextDouble();
		
		if (user.equals("") && !(initDep > 0)) {
			BankAccount 

		}
		



		

	}


}
