package day29_method;

public class FrequencyCharacter {
    public static int frequencyOfChaar(String str,char letter){
       int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==letter){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChaar("java",'a'));
        System.out.println(frequencyOfChaar("apple",'a'));
        System.out.println(frequencyOfChaar("apple",'p'));
    }
}
