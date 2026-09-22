/*
 *	Author:  Pascal 
 *  Date:  9/21
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input two integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean bro = a == b;
		boolean hi = a != b;

		if (bro) {
			System.out.println("a and b are the same");

		} if (hi) {
			System.out.println("a and b are different");
		}
	}
}
