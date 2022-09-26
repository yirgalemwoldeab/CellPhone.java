package day24_array;
import java.util.Arrays;
public class ReverseSentence {
    public static void main(String[] args) {
  /*
    Reverse Array
	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
     */

            int[] arr = {1, 2, 3, 4, 5};
            int[] reverse = new int[arr.length];

            for(int i = arr.length - 1, y= 0; i >= 0; i--, y++){ // i goes backwards
                reverse[y] = arr[i];
            }

            // use i variable that is going backwards to read from the original array - index for arr array
            // use y variable that is going forwards to store into the reverse array - index for reverse array

            System.out.println(Arrays.toString(reverse));








        }
    }

/*
    int i = last index
    int y = 0;
    while(i >=  0){
        i--
        y++
     }
 */





