/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;





class starter {
	public static boolean checkPrime(int a) {
		int divi = a-1;
		boolean isPrime = false;

		while (divi > 0) {
			if(a % divi == 0) {
				isPrime = true;
				break;
			} else {
				isPrime = false;
			}
			divi --;
			
		}

		return isPrime;
	}

	public static void printPrimes(int a) {
		int count = a;
		while (count > 0) {
			if (checkPrime(count)){
				System.out.println(count);
			} 
			
			
			
			count--;
		}
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int y = sc.nextInt();

		// printPrimes(y);

		
		if (checkPrime(8)) {
			System.out.println("t");
		} else {
			System.out.println("f");
		}



	}
}
