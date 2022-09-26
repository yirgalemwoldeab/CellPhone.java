package day38_encapsulation;

public class UseRectangle {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        //rectangle.length=10;
        rectangle.setLength(10);
        rectangle.setWidth(5);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
