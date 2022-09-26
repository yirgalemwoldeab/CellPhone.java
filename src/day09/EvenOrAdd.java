package day09;

import java.util.Scanner;

public class EvenOrAdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enater a number");
        int num= input.nextInt();

        if (num%2==0){
            System.out.println(num+"is even");
        }

        if (num%2==1){
            System.out.println(num+"is odd");
        }



    }




}
