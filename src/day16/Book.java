package day16;

public class Book {
    public static void main(String[] args) {

        int x=4;
       int  y=x++;

        System.out.println(x);
        System.out.println(y);


        System.out.println();
        int a=4;
        int b=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a);

        int num =4;
        boolean isPositive=num>=0;
        boolean isNegative=num<0;
        boolean zero=num==0;

        System.out.println(num>=0);


        boolean citizen=true;
        boolean hasCriminal=false;
        System.out.println(citizen ||hasCriminal);

    }
}
