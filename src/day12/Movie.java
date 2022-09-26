package day12;

public class Movie {
    public static void main(String[] args) {

        //The length of the movie will determine how much it costs.
        //    declare and assign a variable for the duration of the movie
        // The length will be given as a decimal as hours.minutes
        // duration of less than or equal to 0:
        // Movies cannot be less than 0 minutes
        //  duration of more than 4:
        // Movies cannot be more than 4 hours
        //  for all other duration uses the following values to display the
        //  price of the tickets
        // duration --> price
        // 1.0 --> 8.99
        // 1.5 --> 10.50
        // 2.0 --> 12.99
        //  2.5 --> 14.50
        //  3, 3.5 or 4 --> 15.99

        double price ;
        double duration  =1.5;

        if (duration > 0 && duration <= 4) {

            if (duration == 1.0) {
                price = 8.99;
                System.out.println("pricce"+price+"duration"+duration);
            } else if (duration == 1.5) {
                price = 10.55;
                System.out.println("pricce"+price+"duration"+duration);
            } else if (duration == 2.00) {
                price = 12.99;
                System.out.println("pricce"+price+"duration"+duration);
            } else if (duration == 2.5) {
                price = 14.50;
                System.out.println("pricce"+price+"duration"+duration);
            } else if (duration >= 3 || duration <= 4) {
                price = 15.99;
                System.out.println("pricce"+price+"duration"+duration);
            }


        }
        if (duration < 0 || duration > 4) {
            if (duration < 0) {
                System.out.println("movie can not be less than 0");
            } else if (duration > 4) {
                System.out.println("movie can nto be greater than 4");

            }
        }


    }

}











