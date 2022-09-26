package day38_encapsulation.square;

public class Square {

  /*  create a class called Square
- data:
    side
- constructor
- create a constructor that creates a Square object with the
    side
    call setter here
- encapsulate the Square class
- setter condition: side must be a positive number
    otherwise it will not be assigned to the instance variable
- other methods methods:
            - calculateArea()
    calculate and return the area of a
    Square
- calculatePerimeter()

   */

   private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>0) {
            this.side = side;
        }if(side<0){
            System.out.println("not valid");
        }
    }

   public double area() {
        double area;
        if(side>0) {
            return area = side * side * side * side;
        }

return -1;
   }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+area();
    }
}
