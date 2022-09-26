package day19;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        //guess a secret number
         int secretNumber=87;
         int inputNumber;
         int attempts=0;
        Scanner input=new Scanner(System.in);

        do{
            System.out.println("guess a number");
            inputNumber=input.nextInt();
            if(inputNumber<secretNumber){
                System.out.println("secret number is higher");
            }
            if(inputNumber>secretNumber){
                System.out.println("secret number is lower");
            }

            attempts++;
        }while(secretNumber!=inputNumber);

        System.out.println("you guessed the wrong number"+attempts+"attempts");

    }
}
