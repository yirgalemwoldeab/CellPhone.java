package day20_loop;

import java.util.Scanner;

public class ShoopingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String list = "";
        while (true) {
            System.out.println("enter an item");
            list += "\n *"+input.nextLine();
            System.out.println("do you want to add another item");
            if (input.nextLine().equalsIgnoreCase("no")) {
                break;

            }

        }
        System.out.println(list);


                   }

        }










