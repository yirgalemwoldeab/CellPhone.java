package day42_abstraction.shape;

public class Circle extends Shape{
  public final   double readius;
public Circle(double readius){
    super("circle");
    this.readius=readius;
}

    @Override
    public double area() {

        return readius*readius*Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*readius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "readius=" + readius +
                ", name='" + name + '\'' +
                '}'+"area"+area()+"perimeter="+perimeter();
    }
}
