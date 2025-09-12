package Array;

import java.util.Scanner;

public class PrefixSum {
        static void printArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        static int[] prefix(int[] arr){
            int n= arr.length;
            for(int i=1;i<n;i++){
                arr[i]=arr[i-1]+arr[i];
            }
            return arr;
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
        prefix(array);
        System.out.println("prefix sum of the array is : ");
        printArray(array);
    }
}