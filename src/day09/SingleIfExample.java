package day09;

public class SingleIfExample {

    public static void main(String[] args) {
        if (true) {
            System.out.println("Hello");
            if (false) {

                System.out.println("Bye");
                int year = 2020;
                if (year == 2020 || year == 2021) {
                    System.out.println("stay home ");
                    System.out.println("wash your hand");
                    System.out.println("social distance");

                    double price = 9.99;
                    if (price >= 20) {
                        System.out.println("free shipping");//no result b/c price is 9.99
                    }
                }
            }
        }





    }

}


