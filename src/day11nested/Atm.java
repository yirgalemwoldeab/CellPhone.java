package day11nested;


import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int validPasscode = 7021;

        System.out.println(" welcome to atm enter your card and passcode");
        int userPasscode = input.nextInt();
        if (userPasscode == validPasscode) {
            System.out.println("looged in \n select number\n\t 1) check\n\t2)withdra\n\t3)deposit ");
            int selection = input.nextInt();

            if (selection == 1) {
                System.out.println("your balance is $1,000,000");

            } else if (selection == 2) {
                System.out.println("how much do you want to withdraw");
                System.out.println("withdrawing " + input.nextInt());
            } else if (selection == 3) {
                System.out.println("enter amount you want to deposit");
                System.out.println("depositing" + input.nextInt());
            }


    }else {
            System.out.println("invalid passcode");

        }

    }

}