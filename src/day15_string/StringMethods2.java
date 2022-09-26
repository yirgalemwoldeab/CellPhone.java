package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {
  String word="java"   ;
        System.out.println(word.startsWith("j"));
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("jae"));
        System.out.println(word.endsWith("a"));
        System.out.println(word.startsWith("A"));
        System.out.println(word.startsWith("java"));


        String str="today is 80 degrees";
        System.out.println(str.contains("today"));
        System.out.println(str.contains("it 80"));
        System.out.println(str.contains("today") && str.contains("80"));
        System.out.println(str.contains("today 80"));
        System.out.println(str.contains("to")&&str.contains("day"));



    }
}
