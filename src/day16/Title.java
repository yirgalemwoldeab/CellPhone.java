package day16;

public class Title {
    public static void main(String[] args) {

      String    name="Mr james";
      name=name.toLowerCase();



        if (name.startsWith("mr")||name.startsWith("mister")){
            System.out.println("mister mrs hellow sr");
        }else if (name.startsWith("ms")||name.startsWith("madam")||name.startsWith("miss")){
            System.out.println("miss ,ms or madam  hellow ma'am");
        } else if (name.startsWith("Dr")) {
            System.out.println("Dr , hello Dr");


        } else if (name.endsWith("sr")) {
            System.out.println("sr nice to meet you senior");


        } else if (name.endsWith("jr")) {
            System.out.println("nice to meet you jenior");
        }
String word="java";
        System.out.println("first letter: "+word.startsWith("a"));
        System.out.println("last letter: "+word.endsWith("e")) ;




    }
}
