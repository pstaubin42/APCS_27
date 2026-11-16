/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String[] song = new String[10];

		song[0] = "In my eyes, indisposed";
		song[1] = "In disguises, no one knows";
		song[2] = "Hides the face, lies the snake";
		song[3]	= "In the sun in my disgrace";
		song[4] = "Boiling heat, summer stench";
		song[5] = "Neath the black, the sky looks dead";
		song[6] = "Call my name through the cream";
		song[7] = "And I'll hear you scream again";
		song[8] = "Black hole sun, won't you come";
		song[9] = "and wash away the rain?";
		
		int count = 0;
		while (count < 10) {
			System.out.println(song[count]);
			count ++;
		}


		
	}
}
