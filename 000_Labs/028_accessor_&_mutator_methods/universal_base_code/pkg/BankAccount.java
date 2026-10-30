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
	boolean isActive;

	static int next = (int)(500*Math.random());

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unclaimed account";
		accountNum = next;
		next++;
		balance = 0.0;
		isActive = true;
	}

	public BankAccount(String a){
		owner = a;
		accountNum = next;
		next++;
		balance = 0;
		isActive = true;
	}

	public BankAccount(String a, double b){
		owner = a;
		accountNum = next;
		next++;
		balance = b;
		isActive = true;
	}
	
	// -------METHODS-------

	public String getOwner(){
		return owner;
	}

	public void setOwner(String a) {
		owner = a;
	}

	public int getID(){
		return accountNum;
	}
	
	public void closeAccount(){
		isActive = false;
	}

	public boolean isActive(){
		return isActive;
	}

	public void deposit(double b){
		if (isActive){
			balance += b;
		} else {
			System.out.println("Cannot add to balance due to inactive account.");
		}
	}

	public void withdraw(double a) {
		if ((isActive) && (a <= balance)) {
			balance -= a;
		} else {
			System.out.println("Cannot withdraw due to inactive account or insufficient funds.");
		}
	}

	public double getBalance(){
		return balance;
	}

	public void displayAccountInfo(){
		System.out.println(owner + "'s Bank Account");
		System.out.println("Account #" + accountNum);
		System.out.println("Balance: " + balance);
		
	}

}