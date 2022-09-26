package day20_loop;

public class CountCharacter {
    public static void main(String[] args) {
        String s="2juMp41EEkd4s4";
        int upper=0,lower=0,number=0;
        for (int i=0;i<s.length();i++){
        char eachlettter=s.charAt(i);
        if(eachlettter>='A' && eachlettter<='Z'){
            upper++;

        } else if (eachlettter>='a'&& eachlettter<='z') {
            lower++;

        } else if ((eachlettter>='0'&& eachlettter<='9')) {
            number++;


        }

        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);

        }
}
