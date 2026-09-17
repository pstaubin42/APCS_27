/*
 *	Author:  Pascal
 *  Date: 9/16
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		double oper1a = 13-6*11;
		double oper1b = 30%7*(-2);

		double oper2 = 3*8+31%7;

		double oper3a = 37/3;
		double oper3b = 35%21;

		double oper4a = Math.pow(2,14%3);
		double oper4b = Math.sqrt(2*6);
		

		System.out.println(Math.max(oper1a, oper1b));
		System.out.println(Math.sqrt(oper2));
		System.out.println(Math.pow(oper3a, oper3b));
		System.out.println(Math.max(oper4a, oper4b));


	}
}
// Max (13 - 6 * 11, 30 % 7 * (-2))
// b. Sqrt (3 * 8 + 31 % 7)
// c. Pow (37 / 3, 35 % 21)
// d. Max( Pow( 2,14%3) , Sqrt ( 2*6) )