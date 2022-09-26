package day30_method;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {
        String str="about 1,690,000,000 result (0.49 seconds)";
        String [] parts=str.split(" ");
        System.out.println(Arrays.toString(parts));
        int result=Integer.parseInt(parts[1].replace(",",""));
if(result>10_000_000){
    System.out.println("narrow");
}
        if(result>50_000) {
            System.out.println("no much");
        }
        double second=Double.parseDouble(parts[3].substring(1));
        System.out.println(second);
        if(second>1.0){
            System.out.println("too long");
        }
        if(second>0.5) {
            System.out.println("ok");
        }else {
            System.out.println("good speed");
        }
    }
}
