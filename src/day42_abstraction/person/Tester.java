package day42_abstraction.person;

public final class Tester extends Employee {

    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }
    @Override
    public void work() {
        System.out.println("running test cases");
        System.out.println("finding locators");
    }
    @Override
    public void sleep(int hours){
        System.out.println("testers sleep for "+hours+"for automation runs");
    }
}
