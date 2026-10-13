/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void toString(String a) {
		System.out.println(a);

	}



	public static void toStringCombine(String a, String b){
		
		System.out.print(a + " " + b);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String greet = "Enter something";
		
		toString(greet);
		String x = sc.nextLine();
		toString(greet);
		String y = sc.nextLine();


		System.out.println("\n Final:");
		toString(x);
		toStringCombine(x, y);

		
		
		
	}
}
