package day39_inheritance.device;

public class UseDevice {
    public static void main(String[] args) {

     TV tv=new TV("sumsung","67ty","wireless",4500) ;
        System.out.println(tv);
        tv.useDevice();





        Phone phone=new Phone("dell","87er","wireless",8976);
        phone.useDevice();
        System.out.println(phone);
    }
}
