package day09;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("are you a student");
        boolean isStudent=input.nextBoolean();

        if(isStudent){
            System.out.println("what are you studying");
            String subject=input.next();
        }
        System.out.println("Do you live in a city");
        if (input.nextBoolean()) {
            System.out.println("cool,cities are loud and cool");

        }else {
            System.out.println("how many years do you live in the suburb");
int years=input.nextInt();
            System.out.println(years);

        }
        }

    }



