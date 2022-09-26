package day21NestedLoop;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "abcabc";
        String str= "";

        for(int i = 0; i < s.length(); i++){
            if(!str.contains(""+ s.charAt(i))){
                str+= s.charAt(i);
            }
        }

        System.out.println(str);







    }
}
