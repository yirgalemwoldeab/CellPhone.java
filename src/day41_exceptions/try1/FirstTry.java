package day41_exceptions.try1;

public class FirstTry {
    public static void main(String[] args) {



        try{
            String s="hell world";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(100));


        }catch (StringIndexOutOfBoundsException e){
            System.out.println("the string was too short it went out of bounds");
        }

        System.out.println("hello");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("invalid time given");
        }

        System.out.println("world");
    }
}
