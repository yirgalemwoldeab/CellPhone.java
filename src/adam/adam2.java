package adam;
import java.util.Arrays;
public class adam2 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
        int[] c={7,8,9};
        int[] d={10,11,12};
        int[] merged=   mergeTwoArray(a,b);
        System.out.println("Arrays.toString(merged) = " + Arrays.toString(merged));

    }

    public static int[] mergeTwoArray(int[] a, int[] b) {
        //I need to create one dummy array
        int [] dummy=new int[a.length+b.length];

        // I need to put my first array into dummy
        int index=0;
        for (int each:a) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3}

        //I need to put my second array into dummy

        for (int each:b) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3,4,5,6}
        //I need to return dummy

        return dummy;
    }


}


