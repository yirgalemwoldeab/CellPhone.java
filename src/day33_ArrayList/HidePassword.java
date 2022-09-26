package day33_ArrayList;

import java.util.ArrayList;

public class HidePassword {

    public static void main(String[] args) {

      /*  Given an ArrayList of passwords (String). Hide each password in a star (*)
        format where each character is a star and print the ArrayList of hidden
                passwords
        Ex:
        Input:
        {"one", "hi", "hold}
            Output:
[ ***, **, **** ]

       */

        ArrayList<String>   password=new ArrayList<>();
        password.add("one");
        password.add("hi");
        password.add("hold");
        if(password.contains("one")&&password.contains("hi")&&password.contains("hold")) {
            password.remove(0);
password.clear();


password.add("***,**,****");




        }

        System.out.println(password);

/*
        Write a program that can extract the special characters, digits and
        letters from a string and stores them into separate ArrayLists of
                Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}

        */


        for (int i = 0; i <=5; i++) {

            System.out.println(i);
            if (i == 3) {
                break;
            }

        }

        for (int i = 0; i <=5; i++) {
            if (i == 3) {

                continue;
            }
                System.out.println(i);


        }
        }



}
