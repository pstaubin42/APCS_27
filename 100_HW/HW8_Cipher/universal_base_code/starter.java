/*
 *	Author: Pascal
 *  Date: 10/19
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Encode a message(1), a message with a key(2), or decode a message and find key(3),  ");
		int choose = sc.nextInt();
		sc.nextLine();

		if (choose == 1) {
			System.out.println("enter message");
			String message = sc.nextLine();

			System.out.println("encoded message: " + Cipher.encode(message));
			
		} else if (choose == 2) {
			System.out.println("enter message");
			String message = sc.nextLine();
			System.out.println("enter key" );
			int key = sc.nextInt();

			System.out.println("encoded message: " + Cipher.keyedEncode(message, key));

		} else if (choose == 3){

			int count = 0;
			System.out.println("enter the coded message")
			String message = sc.nextLine();
		
			while (count < 37) {
			
				System.out.println(Cipher.keyedEncode(message, count));
				System.out.println("Key tested: " + count);
				System.out.println("");
				count ++;
			}

		}

		
		

	}
}
