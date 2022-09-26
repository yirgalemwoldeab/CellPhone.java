package day30_method;
import java.util.Arrays;
import my_utils.ArrayUtil;

public class UsingArrayUtilClass {
    public static void main(String[] args) {

     int num=   ArrayUtil.min(4,2,1,5,1,-1) ;
        System.out.println(num);
        System.out.println(ArrayUtil.min(5,3,4,5,2,5,8));
        System.out.println(ArrayUtil.max(5,3,4,5,2,5,8));
        int [] a={4,5,6,3,6,7};
        System.out.println(ArrayUtil.max(a));
        System.out.println(ArrayUtil.max(new int[]{5,3,4,5,2,5,8}));

       int[] b={4,5,12,5,14};
        System.out.println(ArrayUtil.contains(b,13));
        System.out.println(ArrayUtil.contains(b,5));

        int [] c={4,2,5,1,6};
        System.out.println(ArrayUtil.indexOf(c,5));
        System.out.println(ArrayUtil.indexOf(c,7));

        int [] d={4,2,5,6,4,4,7,1,6};
        System.out.println("index of firsst 6  "+ArrayUtil.indexOf(d,6));
        System.out.println("index of firsst 6  "+ArrayUtil.indexOf(d,6,4));
        int firstIndex=ArrayUtil.indexOf(d,6);
        int secondIndex=ArrayUtil.indexOf(d,6,firstIndex+1);

        String[] words={"java","is","the","best"};
        String[] all=ArrayUtil.addElements(words,"language");
        System.out.println(Arrays.toString(all));

        String[] strs={"today","is","tuesday"};
        String[] other={"no","softskill","today"};
         String[] multipleAdded=ArrayUtil.addElements(strs,other);
        System.out.println(Arrays.toString(multipleAdded));

        }


    }







