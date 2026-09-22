/*
 *	Author:  Pascal
 *  Date:  9/21
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("input 3 integers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		
		if ((x>y) && (x>z)) {
			int large = x;
		}

		if ((y>x) && (y>z)) {
			int large = y;
		}

		if ((z>x) && (z>y)){
			int large = z;
		}




		if ((x<y) && (x<z)) {
			int small = x;
		}

		if ((y<x) && (y<z)) {
			int small = y;
		}

		if ((z<x) && (z<y)){
			int small = z;
		} 

		System.out.println("The largest number is " )
	}
}
