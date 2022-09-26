package day08;

import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        Scanner inpout=new Scanner(System.in);

        System.out.println("item name");
        String item="Ball";
        System.out.println("iterm price");
        double price=5.99;
        System.out.println("how many"+item+"do you want");
        int quanti=3;
         String order="your total for "+quanti+" "+item+"is "+quanti*price;
        System.out.println(order);

    }
}
