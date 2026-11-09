/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// -----------------------
		int a = 8;
		// -------------------
		int divi = a-1;
		boolean isPrime = false;

		while (divi > 0) {
			if(a%divi != 0){
				isPrime = true;
				break;
			} else {
				divi--;
				isPrime = false;
			}
			
			
			
		}

		if (isPrime){
			System.out.println("True");
		} else {
			System.out.println("False");
		}


		//return isPrime;


		
	}
}
