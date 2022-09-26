package day32_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(0);

        list.add(12);
        list.set(2,10);
        System.out.println(list);

        list.set(0,2);
        System.out.println(list);

        ArrayList<String>strs =new ArrayList<>();
        strs.add("friday");
        strs.add("off");
        strs.add("study");

        strs.add("relax");
      int indeOfRelax=strs.indexOf("relax");
      strs.set(indeOfRelax,"coding");
        System.out.println(strs);



    }
}
