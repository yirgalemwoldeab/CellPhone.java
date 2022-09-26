package day41_exceptions.try1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        try{
            System.out.println("enter number one");
        int num1=    input.nextInt();

            System.out.println("enter number two");
            int num2=input.nextInt();

            String s=null;
            s.trim();


            System.out.println(num1+num2);
        }catch (InputMismatchException e){
            System.out.println("need to type number inputs");

        }finally {
            System.out.println("finally run");
            input.close();
        }
    }
}
