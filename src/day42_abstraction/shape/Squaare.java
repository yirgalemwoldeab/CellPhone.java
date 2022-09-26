package day42_abstraction.shape;

import java.util.zip.DeflaterOutputStream;

public class Squaare extends Shape{
    double length;
    double width;

  public Squaare(double length,double width)  {
      super("square");
      this.length=length;
      this.width=width;

  }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*length*width;
    }

    @Override
    public String toString() {
        return "Squaare{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                '}'+"area"+area()+"perimeter"+perimeter();
    }
}
