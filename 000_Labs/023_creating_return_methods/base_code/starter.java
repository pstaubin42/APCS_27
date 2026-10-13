/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {

	public static int pow(int a, int b) {
		
		int product = a; 
		int count = 1;
		while (count < b) {
			product = product *a;
			count = count + 1;


		}


		return product;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a base");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("enter a power");
		int y = sc.nextInt();

		
		System.out.println(pow(x, y));
	}
}
