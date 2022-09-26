package day41_exceptions.hiding;

public class Second extends First {
  public static void staticMethod() {
      System.out.println("static method from second");
  }
    public void instanceMethodB(){
      staticMethod();
    }
}
