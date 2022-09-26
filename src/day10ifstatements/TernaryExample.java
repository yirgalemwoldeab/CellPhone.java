package day10ifstatements;

public class TernaryExample {

    public static void main(String[] args) {
        int score = 50;
        if (score > 70) {
            System.out.println("passing");

        } else {
            System.out.println("failing");
        }
        
        int score2=50;
        String result;
        if (score2>70){
            result="passing"; }else { 
result="failing";}

        System.out.println(result);
            


        int score3=80;
        String result2=score3>70?"passing":"failing";
        System.out.println(result2);
        System.out.println(score3>70?"passing":"failing");



        int n=9;
        System.out.println(n%2==0?"even":"odd");




        boolean green=true;
        System.out.println(green?"drive":"stop");



        int num=10;
        System.out.println(num>0?"positive":num<0?"negative":"zero");










        }

    }

    
