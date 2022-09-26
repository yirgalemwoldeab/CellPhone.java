package day28_method1;

public class CreditScore {
    public static void main(String[] args) {
        check(800);
        System.out.println(check1(789));
        if (check1(600)) {
            System.out.println("get loan");
        } else System.out.println("get higher");

    }


    public static void check(int score) {
        if (score > 700) {
            System.out.println("good");

        } else
            System.out.println("not good");
    }

    public static boolean check1(int score) {
        return score > 700;

    }
}