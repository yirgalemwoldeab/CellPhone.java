package day21NestedLoop;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what number do you want to go to");
        int range = input.nextInt();

        for (int i = 2; i < range; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println(i);
            }
        }  }
}