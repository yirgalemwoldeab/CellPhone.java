package day09;
import java.util.Scanner;
public class Biggest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter the number");
        int a =input.nextInt();

        System.out.println("enter the number");
        int b =input.nextInt();

        System.out.println("enter the number");
        int c=input.nextInt();
        if (a > b && c > a) {
            System.out.println(c + "is the biggest");
        }
    }
}