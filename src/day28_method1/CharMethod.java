package day28_method1;

public class CharMethod {
    public static void main(String[] args) {
        getUpperAtoZ();
        getLowerAtoZ();
        getLowerZtoA();
        getLower0to9();
    }

    public static void getUpperAtoZ() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerAtoZ() {
        for (char letter = 'z'; letter >= 'a'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerZtoA() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");

        }
        System.out.println();
        }
        public static void getLower0to9 () {
            for (char letter = '0'; letter <= '9'; letter++) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }

    }
