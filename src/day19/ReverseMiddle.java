package day19;

public class ReverseMiddle {
    public static void main(String[] args) {

     String str="i love java" ;
     int start=str.indexOf(' ')+1;
     int end=str.lastIndexOf(' ');
    String middleWord=str.substring(start,end);
     String reverseMiddle="";
      for(int i=middleWord.length()-1;i>=0;i--)  {
          reverseMiddle+=middleWord.charAt(i);

      }
        System.out.println(reverseMiddle);

        System.out.println(str.substring(0,str.indexOf(' '))+" "+reverseMiddle+" "+str.substring(end+1));
    }
}
