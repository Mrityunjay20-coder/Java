package Array;

import java.util.Scanner;

public class ArrayPartition {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int arraySum(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
           totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int []arr){
        int totalSum=arraySum(arr);
        int prexSum=0;
        for(int i=0;i<arr.length;i++){
            prexSum+=arr[i];
            int suffixSum=totalSum-prexSum;
            if(prexSum==suffixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("enter array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("original array: ");
        printArray(array);
        System.out.println();
        System.out.println("Equal Partition Possible: "+equalSumPartition(array));
    }
}
