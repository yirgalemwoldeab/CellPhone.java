package day29_method;
import day28_method1.Numbers;
public class TestCalling {
    public static void main(String[] args) {
        int[] arr={3,1,4,5};
       int sum= ExtraPractice.sumFromArray(arr);
        System.out.println(sum);
        double value=ExtraPractice.currencyConvertor("won",130);
        System.out.println(value);

        Numbers.check(9);
    }
}
