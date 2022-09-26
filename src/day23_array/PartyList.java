package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("how many people are coming to the party");
        int size=input.nextInt();
        String[] names=new String[size];
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            System.out.println("enter the name of person "+i);
            String guest =input.next();
          names[i]=guest;

        }
        System.out.println("final list coming to the party");
        System.out.println(Arrays.toString(names));
    }
}
