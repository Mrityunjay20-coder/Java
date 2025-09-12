package Array;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.print("enter array elements: " );
        for (int i=0;i< array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.print("the elements of the array are: ");
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
