package day41_exceptions.try1;

public class MultipleCatch {
    public static void main(String[] args) {
        try {

            System.out.println(5 / 0);
            String s=null;
            s.trim();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("second catch block"+ e.getMessage());
        }
        System.out.println("end");
    }
}
