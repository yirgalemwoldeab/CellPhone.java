package day05;

public class WithSmallerTypesOfJava {

    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 4;

        System.out.println(b1 + b2);

        //byte b3 = b1 + b2; during the calculation the values are turned to int so the result is int

        //solutions:
        int i = b1 + b2;

        byte b3 = (byte) (b1 + b2);

    }
}