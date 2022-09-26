package day05;

public class Employee {





    public static void main(String[] args) {

        String firstName = "jammes";
        String lastName = "bond";
        String company = "mi6";
        String jobTitle = "secret";
        char suite = 'E';
        int employeeId = 7;
        int numberPto = 15;
        double sawlary = 1_000 - 00;
        boolean isFullTime = true;

        String fullName = firstName + "" + lastName;
        String email = firstName + employeeId + '@' + company + ".com";
        String benefits = "$" + sawlary + "salary of year" + numberPto + "pto days and WFH";
        String summary = "employee information for" + fullName + "" + jobTitle + "for" + company + ",base in suite" + suite +
                ".Mr/Mrs" + lastName + "is full time" + isFullTime + "contact Mr/Mrs" + lastName + "at" + email + "current benefits include" + benefits;

        System.out.println(summary);


    }

}
