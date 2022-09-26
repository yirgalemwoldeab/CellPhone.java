package day_45_learn_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        Set<String>  set1=new HashSet<>() ;//random order
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("5.0");
        set1.add("hello world");
        set1.add("java");

        System.out.println(set1);


        Set<String>  set2=new LinkedHashSet<>() ;//insertion order
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("5.0");
        set2.add("hello world");
        set2.add("java");

        System.out.println(set2);

        Set<String>  set3=new TreeSet<>() ;// null is not accepted
       // set3.add(null);
        set3.add("hello world");
        set3.add("5.0");
        set3.add("zebra");
        set3.add("5.0");
        set3.add("hello world");
        set3.add("java");

        System.out.println(set3);
    }

}
