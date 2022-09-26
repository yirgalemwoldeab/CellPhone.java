package day16;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname=input.next();
        System.out.println("enter your last name");
        String lastname=input.next();

        String initials=""+firstname.charAt(0)+lastname.charAt(0);
        System.out.println("first name"+firstname);
        System.out.println("last name"+lastname);
        System.out.println(initials.toUpperCase());


    }
}
