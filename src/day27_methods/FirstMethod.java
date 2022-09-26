package day27_methods;

public class FirstMethod {
    public static void unlock() {
        System.out.println("unlocking door");

    }


    public static void open() {
        System.out.println("open door");
    }


    public static void sitAndStart() {
        System.out.println("sitting");
        System.out.println("insite the key");
        System.out.println("start the car");

    }

    public static void checking() {
        System.out.println("mirrorr");
        System.out.println("rear mirrorr");
        System.out.println("view mirrorr");
    }
    public static void late() {
        unlock();
        open();
        checking();


    }
    public static void main(String[] args) {
        unlock();
        open();
        checking();
late();
    }
}
