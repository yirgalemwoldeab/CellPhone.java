package day28_method1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        check(5);
        check(-5);
        check(0);

        Scanner input=new Scanner(System.in) ;
        check(input.nextInt());

}

    public static void check(int n) {
        if (n > 0) {
            System.out.println("positive");
        }

        if (n < 0) {
            System.out.println("negative");
        }

        if (n == 0) {
            System.out.println("zero");

        }

    }
            }