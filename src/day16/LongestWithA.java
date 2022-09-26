package day16;

public class LongestWithA {
    public static void main(String[] args) {
        String word = "java";
        String word1 = "mouse";
        String word2 = "computer";

        if (word.length() > word1.length() &&word.length()>word2.length() || word.contains("a")) {
            System.out.println("word");

        }
        if (word1.length() > word.length() && word1.length()>word2.length()|| word1.contains("a")) {
            System.out.println("word1");
        }
        if (word2.length() > word.length() && word2.length()>word1.length()|| word2.contains("a")) {
            System.out.println("word2");

        }

    }
}
