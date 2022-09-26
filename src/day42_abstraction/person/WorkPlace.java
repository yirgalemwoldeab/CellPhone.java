package day42_abstraction.person;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {

        Tester obj=new Tester("baz",20,"sdet",100_100);
        System.out.println(obj);
           obj.sleep(8);
           obj.work();
        ArrayList<Tester> testers=new ArrayList<>();
        testers.add(obj);
        testers.addAll(Arrays.asList(
                new Tester("bato",30,"sdet",150_000),
                new Tester("jonatan",40,"senior",800_000),
                new Tester("isa",30,"sdet",120_000),
                new Tester("Nasiba", 25,  "SDET", 120_000),
                new Tester("Nargiz", 27, "Qa engineer ", 120000)));


                for(Tester each:testers) {
            System.out.println(each);
            each.sleep(8);

                }
        }
}
