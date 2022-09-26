package day20_loop;

public class loopStatementJava {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                // the loop stops when the i is 2
break;
            }
            System.out.print(i);
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue; // the loop skips the iterations when i is 2, so 2 isn't printed

            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }


    }
}