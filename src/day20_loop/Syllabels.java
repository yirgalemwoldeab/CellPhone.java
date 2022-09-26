package day20_loop;

public class Syllabels {
    public static void main(String[] args) {

         /*
     Syllables
     Given a String separated by dashes calculate how many syllables the words are
         Ex:
             Input:
                 ja-va
             Output:
                 2
      */

            String s = "ja-va";
            int count = 0; // the number of syllabus would be equal to the number of - characters plus one because the - are used to separate two syllabus

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '-'){
                    count++;
                }
            }
            System.out.println(count);
        }



    }

