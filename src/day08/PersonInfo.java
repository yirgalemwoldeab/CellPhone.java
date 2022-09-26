package day08;

import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName = input.nextLine();
        System.out.println("please enter your last name");
        String lastName = input.nextLine();

        System.out.println("please enter your adress");
        String adress=input.nextLine();
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("adress = " + adress);




    }
}
