/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		//Manager Interface

		String dash = "=========================================";
		System.out.println(dash);
		System.out.println("======  Welcome to Your Restraunt  ======");
		System.out.println(dash);

		Scanner sc = new Scanner(System.in);
		

		System.out.println("What would you like to name your Restraunt? ");
		String name = sc.nextLine();
		System.out.println("What is your name? ");
		String manager = sc.nextLine();


		//Add items
		System.out.println("Add three items to your menu: ");
		System.out.println("");
		
		System.out.println("Item #1: ");
		String item1 = sc.nextLine();
		System.out.println("How much do you want to charge for this item? (in $)");
		double price1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("");

		System.out.println("Item #2: ");
		String item2 = sc.nextLine();
		System.out.println("How much do you want to charge for this item? (in $)");
		double price2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("");

		System.out.println("Item #3: ");
		String item3 = sc.nextLine();
		System.out.println("How much do you want to charge for this item? (in $)");
		double price3 = sc.nextDouble();
		sc.nextLine();
		System.out.println("");


		//Customer Interface		

		System.out.println("");
		System.out.println("===== Welcome to " + name + " ====");
		

		//Menu
		System.out.println("Here is the menu: ");
		System.out.println(item1 + " - $" + price1);
		System.out.println(item2 + " - $" + price2);
		System.out.println(item3 + " - $" + price3);

		//Order
		double total = 0.0;
		System.out.println("What would you like? (enter the name of the item)");
		String order = sc.nextLine();
		System.out.println("And how many?");
		int quant = sc.nextInt();
		sc.nextLine();
		
		if (order.equals(item1)) {
			total = total + (price1*quant);
		} else if (order.equals(item2)) {
			total = total + (price2*quant);
		} else if (order.equals(item3)) {
			total = total + (price3*quant);
		} else {
			System.out.println("We don't serve that here");
		}

		System.out.println("Anything else? (enter the name of the item)");
		String order2 = sc.nextLine();
		
		

		String WholeOrder = quant + " " + order;

		if (order2.equals(item1)) {
			System.out.println("And how many?");
			int quant2 = sc.nextInt();
			sc.nextLine();
			total = total + (price1*quant2);

			WholeOrder = quant2 + " " + order2;
		} else if (order2.equals(item2)) {
			System.out.println("And how many?");
			int quant2 = sc.nextInt();
			sc.nextLine();
			total = total + (price2*quant);
		} else if (order2.equals(item3)) {
			System.out.println("And how many?");
			int quant2 = sc.nextInt();
			sc.nextLine();			
			total = total + (price3*quant);
		} else if (order2.equals("no")){
			System.out.println("Ok");
		} 


		//Tip
		System.out.println("Your order total is " + total);
		System.out.println("What percentage tip do you want to add?");
		double tipPct = sc.nextDouble();
		double tip = tipPct/100;
		
		double grandTotal = total + (total*tip);
		System.out.println("Your total is " + grandTotal);
		

	}
}
