/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name  = sc.nextLine();
		System.out.println("Would you like to be a Wizard, a  Warrior, or a Rouge?");
		String typeSelect = sc.nextLine();
		System.out.println("");

		String title = "error";
		int stren;
		int dext;
		int intel;
		int charis;

		
		if (typeSelect.equalsIgnoreCase("wizard")) {
			stren = 2;
			dext = 5;
			intel = 8;
			charis = 6;
			title = name + " the Wizard";
		} else if (typeSelect.equalsIgnoreCase("warrior")) {
			stren = 7;
			dext = 5;
			intel = 2;
			charis = 5;
			title = name + " the Warrior";
		} else if (typeSelect.equalsIgnoreCase("rouge")) {
			stren = 4;
			dext = 7;
			intel = 4;
			charis = 4;
			title = name + " the Rouge";
		} else {
			System.out.println("Incorrect input. Restart game.");
			return;
		}
		System.out.println("Welcome, " + title);
		System.out.println("Your base stats are: \nstrength: " + stren + " \ndexterity: " + dext);
		System.out.println("intelligence: " + intel + "\ncharisma: " + charis);
		System.out.println("");

		int points = 20;
		int spend;
		String pickStat = "";

		while ((points > 0) && (pickStat != "e")){
			
			System.out.println("\nYou have " + points + " points to spend on upgrading your stats. Which stat would you like to upgrade?");
			System.out.println("Enter 's' for strength, 'd' for dexterity, 'i' for intelligence, 'c' for charisma, or 'e' to end upgrading ");
			pickStat = sc.nextLine();


			if(pickStat.equalsIgnoreCase("s")){
				System.out.println("How many points would you like to spend?(max 10)");
				spend = sc.nextInt();
				sc.nextLine();
				spend = Math.min(spend, 10);
				spend = Math.min(spend, points);


				points = points - spend; 
				stren = stren + spend;
			} else if(pickStat.equalsIgnoreCase("d")){
				System.out.println("How many points would you like to spend?(max 10)");
				spend = sc.nextInt();
				sc.nextLine();
				spend = Math.min(spend, 10);
				spend = Math.min(spend, points);

				points = points - spend; 
				dext = dext + spend;
			} else if(pickStat.equalsIgnoreCase("i")){
				System.out.println("How many points would you like to spend?(max 10)");
				spend = sc.nextInt();
				sc.nextLine();
				spend = Math.min(spend, 10);
				spend = Math.min(spend, points);


				points = points - spend; 
				intel = intel + spend;
			} else if(pickStat.equalsIgnoreCase("c")){
				System.out.println("How many points would you like to spend?(max 10)");
				spend = sc.nextInt();
				sc.nextLine();
				spend = Math.min(spend, 10);
				spend = Math.min(spend, points);


				points = points - spend; 
				charis = charis + spend;
			} else {
				System.out.println("Entered wrong letter. Try again");
				spend = 0;
			}


		}

		System.out.println(title + " has " + stren + " strength, " + dext + " dexterity, " + intel + " intelligence, and " + charis + " charisma.");


	}
}
