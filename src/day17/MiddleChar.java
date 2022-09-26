package day17;

public class MiddleChar {
    public static void main(String[] args) {

    String str="elephant" ;
    if (str.length()%2==1){
       int middleIndex= str.length()/2;
        System.out.println("middle character "+str.charAt(middleIndex));
    }else {
int first=str.length()/2-1;
int second=str.length()/2;
        System.out.println("middle character are"+str.charAt(first)+str.charAt(second));


    }





    }

}
