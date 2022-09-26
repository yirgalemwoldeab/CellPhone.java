package day05;

public class SalaaryCalculator {

    public static void main(String[] args) {

        float stateTax=100000*0.08f;
        float federalTax=100000*0.21f;
        int salary=100000;
        float totalTax=stateTax+federalTax;
        float salaryAfterTax=salary-totalTax;

        System.out.println("salary"+"\t\t"+salary);
        System.out.println("state tax"+"\t\t"+stateTax);
        System.out.println("federal tax"+"\t\t"+federalTax);
        System.out.println("total tax"+"\t\t"+totalTax);
        System.out.println("salary after tax"+"\t\t"+salaryAfterTax);





    }
}
