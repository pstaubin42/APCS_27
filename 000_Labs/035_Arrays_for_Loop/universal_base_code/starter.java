/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int []x = new int[1000];
		for(int i = 0; i < 1000; i++) 
			x[i] = (int)(1000*Math.random());
		

		for(int i = 0; i < 1000; i++)
			System.out.println(x[i]);
	}
}
