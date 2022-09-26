package day10ifstatements;
import java.util.Scanner;
public class CampusTime2 {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);

        System.out.println("enter the time from0-23 in 24h format, where 0 is midnight");
        int time=input.nextInt();
        String message="";

        if (time>=6 && time<=11) {
            message="good morning";}
        else if (time >= 12 && time <= 16) {
            message="good AFTERNOON";
        }
        else if (time >= 17) {
            message="good NIGHT";}
        else{
            message="not in 24h range";
        }
    }


    }



