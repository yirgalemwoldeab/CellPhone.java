package day_44_polylmorphism.employee;

public final class Tester extends Employee implements CreatSmokeTest{

    public Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("running test cases");
    }

    @Override
    public void create() {
        System.out.println("Creating automatic smoke test");
    }

    public void writeBugReport(){
        System.out.println("Found bug, writing report");
    }

}
