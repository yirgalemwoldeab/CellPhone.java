package day30_method;

public class EachCharacter {
    public static void main(String[] args) {
        String s = "49jaHGK#*768";
        String upper = "", lower = "", special = "", number = "";
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (Character.isLowerCase(letter)) {
                lower += letter;
            }
            if (Character.isUpperCase(letter)) {
                upper += letter;

            }
            if (Character.isDigit(letter)) {
                number += letter;

            } else {
                special += letter;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);
        System.out.println(special);
    }
    }