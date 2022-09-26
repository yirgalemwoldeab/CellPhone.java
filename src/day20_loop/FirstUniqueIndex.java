package day20_loop;

public class FirstUniqueIndex {
    public static void main(String[] args) {
        String str = "AAABCCGGGGGDEEF";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 5) {
                System.out.println(i);
                System.out.print(str.charAt(i));
                break;
            }

        }



    }
}
