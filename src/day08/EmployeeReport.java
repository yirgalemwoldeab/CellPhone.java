package day08;

import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter your full name");
        String fullName= input.nextLine();
        System.out.println("enter your job title");
        String jobTitle= input.nextLine();
        System.out.println("enter your hourly rate");
        double hourlyRate= input.nextDouble();
        System.out.println("what is the average number of hours a week");
        int hours= input.nextInt();

            double salary=hours*52*hourlyRate;
        System.out.println("where is the company Hq");


        System.out.println("hq location");
        String hqLocation = input.nextLine();
        input.nextLine();
        System.out.println("are you full");
        boolean fullTime= input.nextBoolean();
        System.out.println("full time");

       String report=fullName+"is a "+jobTitle+"they make"+salary+"because they are full time"+fullTime+"the hq is"+hqLocation;

        System.out.println(report);



    }
}