/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year)){
			System.out.println(year + " is a leap year!");
		} else {
			System.out.println(year + " is not a leap year!");
		}


		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}


	public static boolean isLeapYear(int a){
		if (a%4 == 0)  {
			if ((a%100 == 0) && !(a%400 == 0)) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static int getDigitSum(int a){
		
		int total = 0;
		while (a>10){
			
			total = total + a%10;
			a = a/10;
			
		
		}
		total = total + a%10;
		return total;
	}

	public static void printIfConsecutive(int a, int b, int c){
		
		//Bonus feature I added by accident:
		//If the numbers are inputted out of order, the method will sort them.


		int least = 0;
		int midd = 0;
		int most = 0;
		if ((a < b) && (b < c)) {
			least = a;
			midd = b;
			most = c;
		} else if ((a < c) && (c < b)) {
			least = a;
			midd = c;
			most = b;
		} else if ((b < a) && (a < c)) {
			least = b;
			midd = a;
			most = c;
		} else if ((b < c) && (c < a)) {
			least = b;
			midd = c; 
			most = a;
		} else if ((c < b) && (b < a)) {
			least = c;
			midd = b;
			most = a;
		} else if ((c < a) && (a < b)) {
			least = c;
			midd = a;
			most = b;
		} else {
			System.out.println("logic error");
		}
		
		if ((least + 1 == midd) && (midd + 1 == most)) {
			System.out.println("The three numbers are consecutive in the order: " least + ", " + midd + ", " + most);
		} else {
			System.out.println("The three numbers are not consecutive.");
		}
	}






}
