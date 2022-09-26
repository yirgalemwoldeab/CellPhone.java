package day17;

public class IsEmpty {
    public static void main(String[] args) {

      String s="hello"  ;
        System.out.println(s.isEmpty());
        String y=  "       ";
        System.out.println(y.isEmpty());
        String z= "";
        System.out.println(z.isEmpty());
        String b="h        ";
        System.out.println(b.isEmpty());
        System.out.println(b.isBlank());

String c="   ";
        System.out.println(c.isEmpty());
        System.out.println(c.isBlank());



        String str="java";
        str=str.replace('a','z');
        System.out.println(str);

        String str2="an apple path";
        System.out.println(str2.replace("a","(a)"));

String str3="  multiple words here  ";
        System.out.println(str3.trim());
        str3=str3.replace("  ","");
        System.out.println(str3);

        String r="wooden spooon";
        System.out.println(r.replace("o","-"));
        System.out.println(r.replace("o","-"));

        String ex="wooden spoon";
        int first0=ex.indexOf('o');
        int second0=ex.indexOf('o',first0+1);
        System.out.println(ex.substring(0,second0));
        System.out.println(ex.substring(second0).replaceFirst("o","-"));
        System.out.println(ex.substring(0,second0)+ex.substring(second0).replaceFirst("o","-"));


    }
}
