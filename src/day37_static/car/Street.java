package day37_static.car;

public class Street {
    public static void main(String[] args) {

     Car bmw=new Car("X5","james",34657,'c')  ;
        System.out.println(bmw);
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);

       // for using the overloaded with Driver argument
       // Driver obj = new Driver("name", 0, 'A')
       // Car car = new Car("car", obj);

    }
}
