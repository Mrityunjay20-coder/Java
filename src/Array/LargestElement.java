package Array;
import java.util.*;

public class LargestElement {
    static int largestElement(int[]array){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]array={23,34,76,45,56,67};
        System.out.println("largest value is: "+largestElement(array));
    }
}
