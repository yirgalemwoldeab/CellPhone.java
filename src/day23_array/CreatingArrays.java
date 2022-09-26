package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
     String[] studen1={"04","chiristina","gaidmocia","b27"}  ;
        System.out.println(Arrays.toString(studen1));
    String[] studen2=   new String[4] ;
      studen2[0]  ="10";
      studen2[1]="ikes";
      studen2[2]="ande";
      studen2[3]="27";

        System.out.println(Arrays.toString(studen2));

        Scanner input=new Scanner(System.in);
        String[] student3=new  String[4];
        System.out.println("enter id");
        student3[0]=input.next();

        System.out.println("enter name");
        student3[1]=input.next();
        System.out.println("enter last name");
        student3[2]=input.next();
        System.out.println("enter batch");
        student3[3]=input.next();
        System.out.println(Arrays.toString(student3));

      String[]  studen4=new String[4];

        String[]  questions={"id","name","last name","batch"};
        for (int i = 0; i <studen4.length ; i++) {
            System.out.println("enter your"+questions[i]);
            studen4[i]=input.next();
            System.out.println(Arrays.toString(studen4));
        }



    }
}
