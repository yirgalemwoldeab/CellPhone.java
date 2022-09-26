package day4_variables;

public class CellPhone {

    public static void main(String[] args) {

        String  brand ="iphone";
        String  model="iphone x";
        String color="rose gold";
        double price=1000.99;
        boolean  hasCamera=true;
        int size=128;
        char sim='A';
        System.out.println("\tphone information :\nbrand:" + brand);
        System.out.println(model+ "in " + color);
        System.out.println("with" + size+"gb the price is $"+price);
        System.out.println("sim type: " + sim+"and has camera:"+hasCamera);

        String report="\tphone information :\nbrand:" + brand +
               "\n" +model+ "in " + color+
                "\nwith" + size+"gb the price is $"+price+
                "\nsim type: " + sim+"and has camera:"+hasCamera;

    }

}
