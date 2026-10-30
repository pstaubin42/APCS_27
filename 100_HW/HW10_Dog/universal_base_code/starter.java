/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog a = new Dog("Al");
		a.setAge(4);

		Dog b = new Dog("Bud", "Golden Retriever");

		boolean loud;

		if(a.isSleeping()){
			System.out.println(a.getName() + " is sleeping");
			loud = false;
		} else {
			a.bark();
			b.bark();
		}

		



	}
}
