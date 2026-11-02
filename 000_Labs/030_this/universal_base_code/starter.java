/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static int randAge(){
		int a = (int)(6+70*Math.random());
		return a;
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		
		PooleDwarf D1 = new PooleDwarf(randName(), randAge());
		PooleDwarf D2 = new PooleDwarf(randname(), randAge());
		PooleDwarf D3 = new PooleDwarf(randName(), randAge());
		PooleDwarf D4 = new PooleDwarf(randname(), randAge());
		PooleDwarf D5 = new PooleDwarf(randName(), randAge());
		PooleDwarf D6 = new PooleDwarf(randname(), randAge());
		PooleDwarf D7 = new PooleDwarf(randName(), randAge());


		// int count = 0;
		// if (D1.isSameName(D2.getName())){
		// 	count++;
		// }
		// if (D1.isSameName(D2.getName())){
		// 	count++;
		// }
		// if (D1.isSameName(D3.getName())){
		// 	count++;
		// }
		// if 
		

		//This lab confused me
	
	}


}
