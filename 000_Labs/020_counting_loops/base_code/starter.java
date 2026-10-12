/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = sc.nextLine();

		System.out.println("and how many times do you want it printed?");
		int num = sc.nextInt();

		int count = 0;
		while(count < num){
			System.out.println(name);
			count++;

		}



		
	}
}
