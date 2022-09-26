package day13Switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("welcome to java");
        System.out.println("how many days will you be staying");
        int days= input.nextInt();
        System.out.println("how many people do you have in the party");
        int people= input.nextInt();
        String roomType;
        double price;
        switch (people) {
            case 1:
                roomType = "single room";
                price = days * 100;
                break;

            case 2:
                roomType = "double room";
                price = days * 125;
                break;

            case 3:
            case 4:
                roomType = "large room";
                price = days * people * 150;
                break;

            case 5:
            case 6:
            case 7:
                roomType = "suite room";
                price = days * 5000;
                break;
            default:
                roomType = "no room available";
                price = 0;

        }

        System.out.println(roomType);
        System.out.println(price);




    }
}
