package day10ifstatements;

public class IfWithNoBrackets {
    public static void main(String[] args) {


        if (3 < 9) {
            System.out.println("first");
            System.out.println("second");
        }

    if(3>9)
        System.out.println("third");
        System.out.println("fourth");


        char a='b';
        if(a=='a')
            System.out.println("lett a");
        else if (a=='b')
            if(a=='c')
            System.out.println("lett c");
            else
                System.out.println("other");


            if(4%2==0)
                System.out.println("is even");
            else
                System.out.println("is odd");




        }

    }
