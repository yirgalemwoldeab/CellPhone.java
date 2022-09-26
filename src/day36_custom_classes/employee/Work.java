package day36_custom_classes.employee;

public class Work {
    public static void main(String[] args) {
        Employee james=new Employee("james Bond",7,"Spy",10_000_000);
        james.goToMeeting();
        System.out.println(james);


        Employee obj2=new Employee("ana",9);
        System.out.println(obj2);


        Employee obj=new Employee("ana");
        System.out.println(obj);
    }
}
