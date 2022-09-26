package day41_exceptions.hiding;

public class First {

    public static void staticMethod(){
        System.out.println("static method from the first class");
    }

   public void instanceMethodA(){

        staticMethod();
   }
}
