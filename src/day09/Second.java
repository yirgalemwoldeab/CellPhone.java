package day09;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter second");
        int secondsInput=input.nextInt();
        int hour=secondsInput/3600;
        secondsInput%=3600;
        int minute=secondsInput/60;
        secondsInput%=60;
        System.out.println("hours = " + hour+"minutes "+minute+secondsInput+" seconds");
    }
}
