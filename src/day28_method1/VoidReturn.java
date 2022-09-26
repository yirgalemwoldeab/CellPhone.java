package day28_method1;

public class VoidReturn {
    public static void main(String[] args) {
sayHello();
sayBye();//no result
        System.out.println(sayBye());
    }
    public static void sayHello(){
        System.out.println("hey");

    }
    public static  String sayBye() {
        return "hey";

    }
}
