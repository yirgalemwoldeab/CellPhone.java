package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterAndNumber {
    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG!";
        String  upper = "";
        String special ="";
       String number="";
        for (int i = 0; i < s.length(); i++) {
            char eachlettter = s.charAt(i);
            if (eachlettter >= 'A' && eachlettter <= 'Z') {

                upper += eachlettter;
                ;


            } else if ((eachlettter >= '0' && eachlettter <= '9')) {

                 number+= eachlettter;

            } else {
                special += eachlettter;
            }
        }



ArrayList<String> let=new ArrayList<>(Arrays.asList(upper.split("")));
        System.out.println(let);






        ArrayList<String> let1=new ArrayList<>(Arrays.asList(number.split("")));
        System.out.println(let1);





        ArrayList<String> let2=new ArrayList<>(Arrays.asList(special.split("")));


        System.out.println(let2);

    }
}
