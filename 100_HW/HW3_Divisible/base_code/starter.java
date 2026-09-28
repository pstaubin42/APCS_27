/*
 *	Author: Pascal
 *  Date: 9/16
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input an integer for x: ");
		int num1 = sc.nextInt();
		System.out.println("Input another one for y: ");
		int num2 = sc.nextInt();

		boolean num1Even = ((num1 % 2) == 0);
		boolean num2Even = ((num2 % 2) == 0);
		
		if (num1Even && num2Even){
			System.out.println("Both numbers are even.");
		} else if ((num1Even != num2Even) && (num1Even)) {
			System.out.println("Integer x is even, but integer y is not");
		} else if ((num2Even != num1Even) && (num2Even)) {
			System.out.println("Integer y is even, but integer x is not");
		} 

		boolean num1Div3 = ((num1 % 3) == 0);
		boolean num2Div3 = ((num2 % 3) == 0);
		boolean num1Div4 = ((num1 % 4) == 0);
		boolean num2Div4 = ((num2 % 4) == 0);
		boolean num1Div5 = ((num1 % 5) == 0);
		boolean num2Div5 = ((num2 % 5) == 0);


		if((num1Div3 && num1Div4) && (num1Div5)) {
			System.out.println("Integer x is also divisible by 3, 4, and 5");

		}
		if ((num2Div3 && num2Div4) && (num2Div5)){
			System.out.println("Integer y is also divisible by 3, 4, and 5");
		}

	}
}



s