/*
 *	Author:  Pascal 
 *  Date: 10/25
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int accountNum;
	double balance;

	static int next = (int)(500*Math.random());

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unclaimed account";
		accountNum = next;
		next++;
		balance = 0.0;
		
	}

	public BankAccount(String a){
		owner = a;
		accountNum = next;
		next++;
		balance = 0;
		
	}

	public BankAccount(String a, double b){
		owner = a;
		accountNum = next;
		next++;
		balance = b;
	}
	
	// -------METHODS-------

	public String getOwner(){
		return owner;
	}

	public int getID(){
		return accountNum;
	}
	
	

	

	public double changeBalance(double b){
	
		balance += b;
		return balance;
	}

	public void checkBalance(){
		System.out.println(balance);
	}

	public void displayInfo(){
		System.out.println(owner + "'s Bank Account");
		System.out.println("Account #" + accountNum);
		System.out.println("Balance: " + balance);
		
	}

}