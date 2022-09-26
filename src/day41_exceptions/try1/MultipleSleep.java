package day41_exceptions.try1;

public class MultipleSleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("hello");

        Thread.sleep((3000));
        System.out.println("seond line" );
        Thread.sleep((3000));
        System.out.println("middle line");
        Thread.sleep(3000);
        System.out.println("third line");
        Thread.sleep(3000);
        System.out.println("bye");
    }
}
