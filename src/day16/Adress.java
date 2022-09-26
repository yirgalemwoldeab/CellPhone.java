package day16;

import java.util.Locale;
import java.util.Scanner;

public class Adress {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in)  ;
        System.out.println("enter your address");
        String address=input.nextLine();
        address=address.toLowerCase(Locale.ROOT);
        address=address.trim();

        if (address.startsWith("500")){
            System.out.println("house is on the right side");
        }
        if(address.startsWith("600")){
            System.out.println("the house is on the left side");
        }

        if(address.contains("DRIVE")){
            System.out.println("we are on drive");

        } else if (address.contains("LANE")) {
            System.out.println("we are on lane");

        } else if (address.contains("ave")) {
            System.out.println("we are on avenue");

        }


    }
}
