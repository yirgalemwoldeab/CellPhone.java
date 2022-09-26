package day22_array;
import java.util.Scanner;

public class SelectElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "sep", "novem", "december"};
        System.out.println("enter the month number");
        int num = input.nextInt();

        if(num >= 1 && num <= 12){ // valid months from 1-12
            System.out.println(months[num - 1]); // to convert the input number to a month index we can subtract by 1 which means if the number was 1 --> 1 - 1 = 0 which means index 0 value will be returned
        } else {
            System.out.println("Invalid month number. Should be 1-12");
        }

        // 3 --> March --> months[2]   --> 3 - 1 --> 2
        // 11 --> November -> months[10] --> 11 - 1 -> 10

    }

        }







