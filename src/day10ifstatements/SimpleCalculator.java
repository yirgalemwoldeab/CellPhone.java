package day10ifstatements;

public class SimpleCalculator {
    public static void main(String[] args) {
        
        int num1=5;
        int num2=24;
        char operator='+';
        double result=0;

        if (operator=='t'){
            result=num1+num2;
            
        } else if (operator=='*') {
            result=num1*num2;
        } else if (operator=='-') {
            result=num1-num2;
        } else if (operator=='/') {
            result=num1/num2;
        } else if (operator=='%') {
            result=num1%num2;
        }else
            System.out.println("invalid operator");
        System.out.println(" "+num1+operator+num2+"="+result);


    }
}
