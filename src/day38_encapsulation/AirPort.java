package day38_encapsulation;

public class AirPort {
    public static void main(String[] args) {
        Flight obj=new Flight("first","chicago","virgina");
        System.out.println(obj.getType());
        System.out.println(obj.getLocation());
        System.out.println(obj.getArrival());

        Flight obj1=new Flight("flying","chicago","virgina");
        System.out.println(obj1.getType());

        obj1.setType("economy");
        System.out.println(obj1.getType());
    }
}
