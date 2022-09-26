package day38_encapsulation.square;

public class UseSquare {
    public static void main(String[] args) {
        Square square=new Square(-5.6);
        System.out.println(square.area());
        System.out.println(square.getSide());

    }
}
