package day20_loop;

public class
MultipleEnd {
    public static void main(String[] args) {

       String str="hello" ;
       int end =3;
       for(int i=0;i<end;i++) {

         str+=  str.charAt(str.length()-1);

       }
        System.out.println(str);
    }

}
