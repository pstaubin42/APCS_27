/*
 *	Author:  Pascal 
 *  Date: 10/23
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
		isActive = false;
	}

	public BankAccount(String a, boolean d){
		owner = a;
		accountNum = next;
		next++;
		balance = 0;
		isActive = d;
	}

	public BankAccount(String a, double b, boolean d){
		owner = a;
		accountNum = next;
		next ++;
		balance = b;
		isActive = d;

	}

	
	// -------METHODS-------

	public String getOwner(){
		return owner;
	}

	public int getID(){
		return accountNum;
	}

	public double getBalance(){
		return balance;
	}
	
	public boolean getStatus(){
		return isActive;
	}


	public void activate(){
		isActive = true;
	}

	public double changeBalance(double b){
	
		balance += b;
		return balance;
	}




}