package day27_methods;

public class Parameters {
    public static void greeting(String name) {
        System.out.println("hello "+name);
        System.out.println("nice to meet you "+name);

    }
    public static void age(int birthYear) {

        System.out.println("you are " + (2022 - birthYear) + "years old");
    }



    public static void main(String[] args) {

        greeting("james");
        greeting("kwlly ");
        age(2000);;
        age(1984);

    }
}
