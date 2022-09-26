package day_44_polylmorphism.employee;

public abstract class Employee extends Person{

    String jobtitle;
    double salary;

    public Employee(String name, String jobtitle, double salary) {
        super(name);
        this.jobtitle = jobtitle;
        this.salary = salary;
    }
public abstract void work();




    @Override
    public String toString() {
        return "Employee{" +
                "jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
