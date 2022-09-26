package day43_abstraction.learning;

public interface Mac {
    public static final String brand="apple";
    String os="IOS";
    void turnOn();
    public static void getBrand(){
        System.out.println("brand is apple");

    }
    public default void typing(){
        System.out.println("typing on apple keyboard");
    }
}
