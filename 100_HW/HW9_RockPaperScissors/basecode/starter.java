/*
 *	Author: Pascal
 *  Date: 10/25
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        C.out.println("Enter 'done' to end, 'yes' to keep playing, and 'no' to run computer simulations.");
        System.out.println("Would you like to play?");
        String chose = sc.nextLine();

        String pick = "";
        int value = -1;
        String compPick = "";

        int simRep = 0;
        int pl1Win = 0;
        int pl2Win = 0;
        int simTie = 0;

        while (!chose.equals("done")){
            if (chose.equals("yes")) {
                System.out.println("Choose rock, paper or scissors by entering your choice.");
                pick = sc.nextLine();

                if (pick.equals("rock") || pick.equals("paper") || pick.equals("scissors")) {
                    compPick = getObject();

                    value = compare2(pick, compPick);

                    if (value == 0){
                        System.out.println("Tie");
                    } else if (value == 1) {
                        System.out.println("You win!");
                    } else if (value == 2) {
                        System.out.println("You lose");
                    } else {
                        System.out.println("error");
                    }

                } else {
                    System.out.println("wrong input. make sure all letters in lowercase. try again");
                    pick = sc.nextLine();
                }
                
                System.out.println("Play again, run computer sims, or quit?(yes/no/done)");
                chose = sc.nextLine();


            } else if (chose.equals("no")) {
                System.out.println("How many times do you want the sim to run?");
                simRep = sc.nextInt();
                String a = sc.nextLine();

                int count = 0;
                while (count < simRep){
                    String pl1 = getObject();
                    String pl2 = getObject();

                    int volue = compare2(pl1, pl2);

                    if (volue == 1){
                        pl1Win++;
                    } else if(volue == 2){
                        pl2Win++;
                    } else if (volue == 0) {
                        simTie++;
                    }

                    count++;

                }

                System.out.println("Player 1 wins: " + pl1Win);
                System.out.println("Player 2 wins: " + pl2Win);
                System.out.println("Ties: " + simTie);

                System.out.println("Play again, run computer sims, or quit?(yes/no/done)");
                chose = sc.nextLine();

            } else {
                System.out.println("wrong input, try again.");
                chose = sc.nextLine();
            }






        }
        


    }

    public static String getObject() {
        int num1 = (int)(12*Math.random());
        String role;
        if ((num1 >= 0) && (num1 <= 3)) {
            role = "rock";
        } else if ((num1 >= 4) && (num1 <= 7)) {
            role = "paper";
        } else if ((num1 >=7) && (num1 <= 11)) {
            role = "scissors";
        } else {
            role = "error";
        }

        return role;
    }

    public static int compare2(String a, String b) {
        int val = -1;
        
        if (a.equals("rock")) {
            if (b.equals("rock")) {
                val = 0;
            } else if (b.equals("scissors")) {
                val = 1;
            } else if (b.equals("paper")) {
                val = 2;
            }
        } else if (a.equals("paper")) {
            if (b.equals(a)){
                val = 0;
            } else if (b.equals ("rock")) {
                val = 1;
            } else if (b.equals("scissors")) {
                val = 2;
            }
        } else if (a.equals("scissors")) {
            if(b.equals(a)){
                val = 0;
            } else if (b.equals("paper")) {
                val = 1;
            } else if (b.equals("rock")) {
                val = 2;
            }
        }

        return val;
    }
}
