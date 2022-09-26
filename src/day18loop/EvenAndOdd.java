package day18loop;

public class EvenAndOdd {
    public static void main(String[] args) {

   int limit=100;
   int count=1;
   while ((count<=limit)){
       if(count%2==0){
           System.out.print(count+" ");
       }
       count++;
   }
        System.out.println();
int back=limit;
   while (back>=1){
       if(back%2==1){
           System.out.print(back+" ");

       }
       back--;
   }






    }

}
