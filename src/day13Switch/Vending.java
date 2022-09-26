package day13Switch;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in) ;
        System.out.println("welcome to vending machine.Select the menu you want to have");
        String menu=input.next();
        switch (menu) {

            case "snacks":
                System.out.println("pick the snack:\n1)chips2)cookies 3)pretzels 4)candy");
                int scackOptions=input.nextInt();
                if(scackOptions==1){
                    System.out.println("chips are selected");
                } else if (scackOptions==2) {
                    System.out.println("cookies are selected");
                } else if (scackOptions==3) {
                    System.out.println("pretzels dispensing");
                } else if (scackOptions==4) {
                    System.out.println("candy  coming right up");
                }else {
                    System.out.println("not valid item");
                }
                break;
            case "drinks":
                System.out.println("pick the drink\n1)juice 2) soda");
                int drinkOption= input.nextInt();
                if (drinkOption==1){
                    System.out.println("juice is going to pick");
                } else if (drinkOption==2) {
                    System.out.println("soda is going to be pick");
                }else {
                    System.out.println("invalid drink");}






        }
    }
}
