package day28_method1;

public class NumberToWord {
    public static void main(String[] args) {
        System.out.println(numberToWord(1));
        System.out.println(numberToWord(6));
        String str=numberToWord(5);
    }


    public static String numberToWord(int n) {
        String word = "";
        switch (n) {
            case 1:
                word = "one";
                break;
            case 2:
                ;
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
        }

        return word;




        }

    }