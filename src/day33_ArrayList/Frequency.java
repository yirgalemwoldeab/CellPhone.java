package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {

    public static void main(String[] args) {
      /*  Count Letters
        Create a method that will accept an ArrayList of Strings and a letter
                (char) print how many times the letter is found in the ArrayList elements
        Ex:
        Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
        letter: ‘a’
        Output:
        6

        ArrayList<S>

       */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "css", "html", "java", "javascript", "selenium"));

        System.out.println(count(list,'a'));
    }


    public static int count(ArrayList<String> list1, char letter) {
        Integer count = 0;

        for (String each : list1) {

            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == letter) {
                    count++;
                }
            }


        }
        return count;



    }
}