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

		f.activate();

		System.out.println("Create a bank account! Enter your name");
		String user = sc.nextLine();
		System.out.println("Initial deposit?");
		double initDep = sc.nextDouble();
		System.out.println("Activate bank account upon opening?(y/n)");
		String decis = sc.nextLine();
		if (decis.equals("y")){
			boolean act = true;
		} else if (decis.equals("n")){
			boolean act = false;
		} else {
			boolean act = false;
		}



		BankAccount m = new BankAccount(user, initDep, act);

	}


}
