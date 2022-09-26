package my_utils;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
      /*  Given an ArrayList of Strings, go through and find Strings that are 4
        characters or less. Take those Strings and put them into a different
        ArrayList. Print that ArrayList of words
        Ex:
        Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
        Output:
 [ tree, loop, cat ]

       */
        ArrayList<String>  name1=new ArrayList<>();
     ArrayList<String>  name=new ArrayList<>() ;
     name.add("apples");
        name.add("tree");
        name.add("loop");
        name.add("cat");
        name.add("animal");
        name.add("shortcut");

for(String each:name){
 if(each.length()<=4) {



  name1.add(each);

 }


}
        System.out.println(name1);


    }
}
