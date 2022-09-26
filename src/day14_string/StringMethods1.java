package day14_string;

import day13Switch.StringObjects;

import java.util.Locale;

public class StringMethods1 {
    public static void main(String[] args) {

       String item="pen" ;//string pool
       String item2=new String ("pen"); //directly in heap
        System.out.println(item==item2); // checks if object item is the same object as item2

        String item3=new String("pen");
        System.out.println(item2==item3);//compares teh two objects are both in the heap

        System.out.println(item.equals(item2));//equal compare if the characters are the same
        System.out.println(item2.equals(item3));
        System.out.println(item3.equals("pen"));
        System.out.println(item.equals("Pen"));
        System.out.println(item.equalsIgnoreCase("Pen"));


        String username="jamesbond";
        String password="BOND007";
        System.out.println(username.equals("jamesbond"));
        System.out.println(username.equalsIgnoreCase("JAMESBOND"));
        System.out.println(password.equals("bond007"));

        String day="tuesday";
        System.out.println(day.length());
        String day2="Friday";
        int len=day2.length();
        System.out.println(len);
        String str=" hello ";
        System.out.println(str.length());
        System.out.println(str);


        String word="summer";
        word.toUpperCase(Locale.ROOT);
        System.out.println(word);
        word=word.toUpperCase();
        System.out.println(word);

        String sentence="hello MY NAME is";
        System.out.println(sentence.toLowerCase(Locale.ROOT));
        System.out.println(sentence);

        sentence=sentence.toLowerCase();
        System.out.println(sentence);

        String s= "    java    " ;
        System.out.println(s.length());

s=s.trim();
        System.out.println(s);
        System.out.println(s.length());

    }
}
