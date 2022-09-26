package my_utils;

public class ArrayUtil {
    public static int min(int ...arr){
        int min=arr[0];
        for(int each:arr){
            if (each<min){
                min=each;

            }
        }
        return min;
    }

    public static int max(int ... arr)  {
        int max=arr[0];
        for(int each:arr){
            if (each>max){
                max=each;

            }
        }
        return max;
    }
public static boolean contains(int[] arr,int num){

   for(int each:arr)  {
       if(each==num){
           return true;

       }
   }
   return false;
}
public static int indexOf(int [] arr,int num){
      for(int i =0;i<arr.length;i++) {
          if(arr[i]==num){
              return i;
          }
      }


  return -1;
}

    public static int indexOf(int [] arr,int target,int startIndex){
for(int i =startIndex;i< arr.length;i++) {
    if (arr[i] == target) {
        return i;
    }

}
    return -1;
}
public static String[] addElements(String[] arr,String element){
        String[] newArr=new String[arr.length+1];
    for (int i = 0; i < arr.length; i++) {
        newArr[i]=arr[i];

    }
    newArr[newArr.length-1]=element;
    return newArr;
}
    public static String[] addElements(String[] original,String[] other) {
     String[] merged=new String[original.length+other.length] ;
        for (int i = 0; i < original.length; i++) {
           merged[i] =original[i];

        }
        for (int i = 0; i < other.length; i++) {
          merged[original.length+i]= other[i] ;
        }
       return merged;
    }

}
