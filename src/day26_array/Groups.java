package day26_array;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
      String[] [] cydeo={
              {"alen","ruth","betty"},
              {"titi","sisi","meri"},

              {"mami","dadi","nava"}
      };

        System.out.println(cydeo.length);
        System.out.println(cydeo[2].length);
        System.out.println(cydeo[0][2]);
        System.out.println(Arrays.toString(cydeo[1]));

        for(String[] eachInner:cydeo){
            System.out.println(Arrays.toString(eachInner));
        }
for(String[] eachInner:cydeo) {
    for (String eachName : eachInner) {
        System.out.println(eachName);


    }
}
for(String[] eachInner:cydeo){
    for(String eachName:eachInner){
        System.out.println(eachName.substring(eachName.length()-1).toUpperCase());


    }
}

    }
}
