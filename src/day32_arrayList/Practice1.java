package day32_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("towel");
        name.add("car");
        name.add("hat");
        name.add("jacket");
        name.add("shoes");
        name.add("hat");

        System.out.println(name);

        ArrayList<Character> myName = new ArrayList<>();
        myName.add('y');
        myName.add('i');
        myName.add('r');
        myName.add('g');
        myName.add('a');
        myName.add('l');
        myName.add('e');
        myName.add('m');
        System.out.println(myName.get(0));
        System.out.println(myName.get(1));
        System.out.println(myName.get(2));
        System.out.println(myName.get(3));
        System.out.println(myName.get(4));
        System.out.println(myName.get(5));
        System.out.println(myName.get(6));
        System.out.println(myName.get(7));









ArrayList<Character> alpha=new ArrayList<Character>();
                for (char i = 'a'; i<= 'z'; i++) {

                    alpha.add(i);
                }
        System.out.println(alpha);


                    alpha.remove(0);

                    alpha.remove(3);

                    alpha.remove(12);

                    alpha.remove(6);
                    alpha.remove(16);

        System.out.println(alpha);





            ArrayList<Double> max = new ArrayList<>();
            max.add(12.23);
            max.add((56.78));
            max.add((78.78));
            max.add((97.78));
            max.add((52.78));
            System.out.println(max);
            double maximum = 0;
        for (double each:max){
            if (each>maximum) {
                maximum = each;


            }
        }
        System.out.println(maximum);
        }



    }