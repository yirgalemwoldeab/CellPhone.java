package day42_abstraction.shape;

public class TestShape {
    public static void main(String[] args) {
        Circle circle=new Circle(5.5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println();
        System.out.println(circle);

        System.out.println();

        Squaare squaare=new Squaare(6,4.5);
        System.out.println(squaare);

    }

}
