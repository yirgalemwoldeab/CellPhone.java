package my_utils;

import java.util.Locale;

public class StringUtil {


  public static  String reverse(String str)  {

    String reverse=""  ;
      for (int i= str.length() ; i>=0; i--) {
          reverse+=str.charAt(i);

      }
      return reverse;
  }

 public static boolean ispaldinrome(String str) {

    return reverse(str).equalsIgnoreCase(str);
 }

 public static String fixFormat(String str){

      return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
 }

 public static String cameCase(String str){
     String[]  allWords=str.split(" ");
     String camelCase=allWords[0].toLowerCase();
     for (int i = 1; i <allWords.length ; i++) {
         camelCase+=fixFormat(allWords[i]);

     }
      return camelCase;
 }
    public static int frequencyOfChar(String str,char letter){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==letter){
                count++;
            }
        }
        return count;
    }




}
