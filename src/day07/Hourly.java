package day07;

import java.util.Scanner;

public class Hourly {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("salary is ");
        double salary= input.nextDouble();
        System.out.println("hours worked  ");
        int hour= input.nextInt();
        System.out.println(" hourly rate = " + salary/hour*52);


    }


}





