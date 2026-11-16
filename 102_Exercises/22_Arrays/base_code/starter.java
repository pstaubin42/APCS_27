/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1001];

		int count = 0;
		while (count < 1001) {
			arr1[count] = count*3 +3;
			count++;
		}

		count = 0;
		System.out.println("First Array:");
		while (count < 1001) {
			System.out.println(arr1[count]);
			count++;
		}
		System.out.println();

		int [] arr2 = new int[1001];
		count = 0;
		while (count < 1001) {
			arr2[count] = 1000-count;
			count++;
		}
		
		count = 0;
		System.out.println("Second Array: ");
		while (count <1001) {
			System.out.println(arr2[count]);
			count ++;
			
		}

	}
}
