package day20_loop;

public class ChountHi {
    public static void main(String[] args) {

        String s="wllwifjhiwjffhijgjehii";
        int count=0;
        while (s.contains("hi")){

            count++;
          s=  s.replaceFirst("hi","");
        }
        System.out.println("count"+count);
        System.out.println(s);

        System.out.println();

        String s2="abhicdhelhilofrhiidayh";
        int count2=0;
        for(int i=0;i<s2.length()-1;i++){
            if(s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i') { // i + 1 checks next char
                count2++;

            }
}
            System.out.println(count2);
      String s3="abhicdhelhilofrhiidayh";
        int count3=0;
for(int i = 0; i < s3.length() - 1; i++){

        if(s3.substring(i, i + 2).equals("hi")) {
            count3++;
        }
        }
        System.out.println(count3);
        }
}




