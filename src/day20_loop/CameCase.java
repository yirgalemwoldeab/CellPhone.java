package day20_loop;

import java.util.Locale;
import java.util.Scanner;

public class CameCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter multiple words");
        String str=input.nextLine().toLowerCase();
        String camelCase="";

        for(int i=0;i< str.length();i++) {
            if (str.charAt(i) == ' ') {
//str.charAt((i+1))
                camelCase += str.substring(i + 1, i + 2).toUpperCase();

                i++;
            } else {
                camelCase += str.charAt(i);
            }

        }



        System.out.println(camelCase);


    }
}
