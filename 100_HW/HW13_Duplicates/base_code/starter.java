/*
 *	Author: Pascal
 *  Date: 11/10/26
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];	// The array in question
		int [] dupes = new int[20];	//stores index of duplicates
		int [] conts = new int[20];	//store index of conts
		int [] bruh = new int[19];	//store what # conts are
		int countD = 0; // dupe counter
		int countC = 0;	// conts counter
		int yo = 0;	// bruh counter, counts number of indexes that have a conts, counts instances of consecutivity

		for(int x = 0; x < 20; x++){
			arr[x] = (int)(10*Math.random()+1);
			
		}
		
		
		
		int target = (int)(10*Math.random()+1);
		
		
		//Dupe checker
		int x = 0;
		boolean dupe = false;
		for(int i = 0; i < 20; i++) {
		
			if(target == arr[i]){
				dupes[countD] = i;
				countD ++;
				
				
			}
			

			

			
		}
		System.out.println();
		System.out.println(countD + " duplicates of " + target);
		for (int i = 0; i < countD; i++) {
			System.out.println("Dupe at: " + dupes[i]);
		}
		System.out.println();


			
		for (int i = 0; i<19; i++) {
			if(arr[i] == arr[i+1]){
				conts[countC] = i;
				countC++;
				conts[countC] = i+1;
				countC++;
				bruh[yo] = i;
				yo ++;
			}


		}
		for (int i = 0; i < countC; i++){
			System.out.println(conts[i]);



		}
		int y = 0;
		for (int i = 0; i < yo; i++){
			System.out.print(bruh[i] + " repeats at ");
			while(y<2) {
				System.out.print(conts[y] + ", ");
				y++;
			}
		}


	}
}
