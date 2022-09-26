package day30_method;

public class WarapperExample2 {
    public static void main(String[] args) {
         /*  Write program that returns true if the total number of uppercase
        characters are equal to total number of lowercase characters of a
                string

        Ex:
        str = "JAVA java";

        output:

        true

       */


        String str1 = "java JAVA";
        String w="";
        String y="";

        Boolean isEqual;
        int count = 0;
        Character let;
        Character let1;

        for (int b = 0; b < str1.length(); b++) {
             let = str1.charAt(b);
            if (Character.isUpperCase(let)){
y+=let;
                System.out.println(let);
            }
        }
        for (int b = 0; b < str1.length(); b++) {
             let1 = str1.charAt(b);
            if (Character.isLowerCase(let1)) {
w+=let1;
                System.out.println(let1);
            }
        }
if (y.length()==w.length());
isEqual=true;
        System.out.println(isEqual);
    }
}
