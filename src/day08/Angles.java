package day08;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("the angles are");
        float angle1 = input.nextFloat();
        float angle2=input.nextFloat();
        float angle3=input.nextFloat();

        float sum=angle1+angle2+angle3;
        boolean triangle=sum==180;
        boolean circle=sum==360;
        System.out.println("is traingle "+ triangle );
        System.out.println("is circle " + circle);

    }
}
