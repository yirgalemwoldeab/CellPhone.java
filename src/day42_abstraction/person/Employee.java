package day42_abstraction.person;

public abstract class Employee extends Person {

    String job;
    double salary;
    public Employee(String name,int age,String job,double salary) {
        super(name, age);
        this.job=job;
        this.salary=salary;
    }

    public abstract void work();

    public  static void yir(){
        System.out.println("today");
    }

    @Override
    public String toString(){
        return super.toString()+" "+job+"$"+salary;
    }
}
