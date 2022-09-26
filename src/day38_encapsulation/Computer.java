package day38_encapsulation;

public class Computer {

  public static void main(String[] args) {
    Computer computer=new Computer("black",340,"Sony");
    System.out.println(computer);
    System.out.println(computer+""+Computer.hasMemory+Computer.hasBattery+Computer.hasScreen);


    Computer computer1=new Computer("brown",240,"dell");
    System.out.println(computer1);
    System.out.println(computer1+""+Computer.hasMemory+Computer.hasBattery+Computer.hasScreen);



  }
   /*
    Computer - static


    class name: computer:
    instance variables:
    price, brand, color, ...

    static variables: hasScreen, hasBattery, hasMemory

    make objects of the class in a main method and access both instance and static members from proper references

*/
String color;

  double price;
  String brand;


  public Computer(String color,double price,String brand){

    this.color=color;
    this.price=price;
    this.brand=brand;

  }

  static boolean hasScreen,hasBattery,hasMemory;

   static {
     hasScreen=true;
     hasBattery=true;
     hasMemory=true;
     System.out.println("has memory ,screen and battery");
   }

  @Override
  public String toString() {
    return "Computer{" +
            "color='" + color + '\'' +
            ", price=" + price +
            ", brand='" + brand + '\'' +
            '}';
  }
}
