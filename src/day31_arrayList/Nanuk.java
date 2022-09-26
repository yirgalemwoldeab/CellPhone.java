package day31_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Nanuk {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("nanuk","4","4","7"));
String s="";
int sum=0;
        for (String each:list) {
            for (int i = 0; i < each.length(); i++) {
                if (Character.isDigit(each.charAt(i))) {
                    System.out.print(each.charAt(i));
                    System.out.println();
                    s+=each.charAt(i);

                }

            }

        }
        System.out.println("<"+s+">"+"/"+"<"+s+">");

String[]s2=s.split("");
int result=Integer.parseInt(s2[0])+Integer.parseInt(s2[1])+Integer.parseInt(s2[2]);
        System.out.println(result);
    }
}
