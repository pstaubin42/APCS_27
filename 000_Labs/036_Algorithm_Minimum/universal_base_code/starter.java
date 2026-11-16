/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [(int)(50+151*Math.random())];

		for (int i = 0; i < arr.length; i++)
			arr[i] = (int)(1+100*Math.random());
		
		int min = 101;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		int max = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		double total = 0.0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++){
			total += arr[i];
		}
		avg = total/arr.length;

		System.out.println("There are " + arr.length + " elements in the array, the minimum value is " + min + ", the maximum value is " + max + ", and the average is " + avg);
	}
}
