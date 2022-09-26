package day20_loop;

public class FirstDuplicate {
    public static void main(String[] args) {
        String str = "ABCCDEEF";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count ==2) { // any amount of characters more than 1 means it was duplicate. We don't care how many times it was repeated, only that it was repeated
                System.out.print(""+str.charAt(i));
                break;

            }

        }



    }
}
