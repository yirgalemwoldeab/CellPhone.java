
package day08;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("the price is ");
        Double price= input.nextDouble();
        System.out.println("the quantity is ");
        int quantity= input.nextInt();

        System.out.println("revenue $ " + price*quantity);




    }

}


