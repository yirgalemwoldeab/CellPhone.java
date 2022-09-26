package day32_arrayList;

import java.util.ArrayList;

public class CreatingArrayList {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>()  ;
        list.add("friday");
        list.add("java");
        list.add("movies");
        list.add("sports");
        System.out.println(list);


        ArrayList<String> list1= list  ;
        list1.add("soft skill");
        System.out.println(list);
        System.out.println(list1);

        ArrayList<String> list3=new ArrayList<>(list)  ;
        list3.remove(0);
        System.out.println(list);
        System.out.println(list3);



    }
}
