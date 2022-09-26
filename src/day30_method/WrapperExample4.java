package day30_method;

public class WrapperExample4 {
    public static void main(String[] args) {
        String str = "div^3";
        String number = "", letter = "";

        for (int i = 0; i < str.length(); i++) {

            char character = str.charAt(i);

            if (Character.isDigit(character)) {
                number += str.charAt(i);
            } else if (Character.isLetter(character)) {
                letter += str.charAt(i);
            }
        }

        int repeat = Integer.parseInt(number);

        for (int i = 0; i < repeat; i++) {
            System.out.print("<" + letter + "></" + letter + ">");
        }
    }
}
