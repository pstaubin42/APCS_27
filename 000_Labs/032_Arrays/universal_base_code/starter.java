/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[10];

		int count = 0;
		int num = 9;

		while (count < 10) {
			arr1[count] = num;
			count ++;
			num --;
		}
		count = 0;
		while (count < 10) {
			System.out.println(arr1[count]);
			count ++;
		}


	}

	

}
