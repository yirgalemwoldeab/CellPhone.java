package day39_inheritance.develop;

public class Developer extends Tester{

    boolean featuresCreated;

    public void develop(){
        System.out.println("features created");
    }

    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.featuresCreated=true;
        developer.develop();
        developer.name="sis";
        developer.work();
        System.out.println(developer.bugsFound);
        developer.test();
        Tester tester=new Tester();
        tester.fullTime="fulltime";
        tester.bugsFound=true;

    }
}
