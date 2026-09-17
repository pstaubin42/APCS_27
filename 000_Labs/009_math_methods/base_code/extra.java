/*
 *	Author:  Pascal 
 *  Date: 9/16
*/

import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for x: ");
        double x = sc.nextDouble();
        System.out.println("Enter a number for y: ");
        double y = sc.nextDouble();

        double max = Math.max(x,y);
        double root = Math.sqrt(y);
        double power = Math.pow(x,y);

        System.out.println("The larger number between x and y is: " + max);
        System.out.println("The square root of y is: " + root);
        System.out.println("X to the power of y is: " + power);
	}
}
