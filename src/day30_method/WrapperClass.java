package day30_method;

public class WrapperClass {
    public static void main(String[] args) {

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Character.isDigit('4'));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isUpperCase('a'));
        String s = "123";
        System.out.println(s + 5);
        int a= Integer.parseInt(s);
        System.out.println(a + 5);
        System.out.println();

        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        //str.toCharArray();
        //str.split("");
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);


            if (Character.isAlphabetic(c)) {
                result += c;
            }
        }

            /*
            if (c==' '){
                result+=c;
            }

             */
        System.out.println("result = " + result);

        }





        }


