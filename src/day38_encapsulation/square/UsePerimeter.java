package day38_encapsulation.square;

import day38_encapsulation.Perimeter;

public class UsePerimeter {
    public static void main(String[] args) {
        Perimeter perimeter=new Perimeter(7,-9);
        System.out.println(perimeter);
        System.out.println(perimeter.getSize());

    }
}
