package day31_arrayList;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {

        ArrayList<Character> letters=new ArrayList<>();
        System.out.println(letters.size());
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('z');
        System.out.println(letters.size());
        System.out.println(letters);
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));


          letters.add(0,'$');
        System.out.println(letters);
        System.out.println(letters.get(1));
        letters.add(3,'8');
        System.out.println(letters);

        ArrayList<String> words=new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        words.remove(2);
        System.out.println(words);
        System.out.println(words.remove(0));
        System.out.println(words);

        words.clear();
        System.out.println(words);
        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);
        words.remove("Cow");
        System.out.println(words);
        words.remove("barn");
        System.out.println(words);


        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0);
        System.out.println(nums);

        Integer a=0;
        nums.remove(a);
        System.out.println(nums);

        nums.remove((Integer)2);
        System.out.println(nums);


        nums.add(0,4);
        System.out.println(nums);
        nums.remove((Integer)4);
        System.out.println(nums);

    }
}
