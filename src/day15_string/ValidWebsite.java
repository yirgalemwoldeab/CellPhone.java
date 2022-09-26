package day15_string;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.println("enter your website");
        String website=input.next();
        boolean validStart=website.startsWith("www.");
        boolean validend=website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov")||website.endsWith(".net");
        if (validStart && validend){
            System.out.println(website+" is valid");

        }else {
            System.out.println(website+" is invalid");

            if (!validStart) {
                System.out.println("web site should start with www.");

            }
            if (!validend){
                System.out.println("website should end with .com or .edu or.gov or.net");
            }
        }
    }
}
