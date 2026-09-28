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

		boolean a = x>y; //y<x
		boolean b = x>z; //z<x
		boolean c = y>x; //x<y
		boolean d = y>z; //z<y
		boolean e = z>x; //x<z
		boolean f = z>y; //y<z
		
		int large = 0;
		int small = 0;

		if (a && b) {
			large = x;
		}

		if (c && d) {
			large = y;
		}

		if (e && f){
			large = z;
		}




		if (c && e) {
			small = x;
		}

		if (a && f) {
			small = y;
		}

		if (b && d){
			small = z;
		} 
		
		System.out.println("The largest number is " + large + " and the smallest number is " + small +".");
	}
}
