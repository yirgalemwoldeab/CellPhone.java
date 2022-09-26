package day13Switch;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("1)select the primitive data type");
        System.out.println("a) String");
        System.out.println("b) int");
        System.out.println("c)main");
        char option= 'b';
        switch (option){
            case'b':
                System.out.println("is correct");
break;
            case 'a':
            case 'c':
                System.out.println("incorrect");
                break;
        }




    }
}
