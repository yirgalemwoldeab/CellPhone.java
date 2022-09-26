package day43_abstraction.language;

import day43_abstraction.Spanish;

public class Speaking {
    public static void main(String[] args) {
        English obj=new English();
        obj.hello();
        obj.bye();



        Spanish obj1=new Spanish();
        obj1.bye();
        obj1.hello();
    }
}
