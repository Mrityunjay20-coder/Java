package Array;
import java.util.Scanner;
public class CopyArray {
    static void printArray(int[]Array){
        System.out.print("the element of the array are: ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the size of array:");
            int n=sc.nextInt();
            int []array=new int[n];
            System.out.print("enter array elements: " );
            for(int i=0;i< array.length;i++){
                array[i]= sc.nextInt();
            }
            System.out.println("original array is: ");
           printArray(array);
            int[] array_2=array;
            System.out.println("the copied array is: ");
            printArray(array_2);
        }
    }

