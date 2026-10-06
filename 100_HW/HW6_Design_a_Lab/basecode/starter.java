/*
 *	Author: Pascal 
 *  Date: 10/1
 * 	Collaborator:
 */

import java.util.Random;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Prospecting Game!");
        int luck = (int)(101*Math.random());
        
       

        System.out.println("Press enter to pan for something valuable");
        sc.nextLine();

        if (luck == 100) {
            String find = "Diamond";
            double price = 500000;


            System.out.println("You found the DIAMOND!!! Sale price: $" + price);

        } else if (luck > 85){
            String find = "Gold";
            double price = 10000;

            System.out.println("You found " + find + "! Sale price: $" + price);
        } else if (luck > 55) {
            String find = "Silver";
            double price = 3000;

            System.out.println("You found " + find + "! Sale price: $" + price);
        } else {
            String find = "Pyrite";
            double price = 1;

            System.out.println("You found " + find + "! Sale price: $" + price);
        }







    }
}
