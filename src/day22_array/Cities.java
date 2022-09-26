package day22_array;
import java.util.Arrays;

public class Cities {
    public static void main(String[] args) {
   String city1="chicago" ;
   String city2="west palm";
        String city3="miami";
        String city4="new york";
        String city5="toronto";
        String city6="hoston";

        String[] cities={"chicago","west palm","miami","new york","toronto","hoston"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);

        System.out.println(Arrays.toString(cities));

        System.out.println(String.join("-",cities));
        System.out.println(cities[0].charAt(0));

    }
}
