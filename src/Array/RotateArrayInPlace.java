package Array;

import java.util.Scanner;
public class RotateArrayInPlace {
    //helper method for printing an array
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //method for reversing an array
    static void reverse(int[]arr,int start,int end ){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    //helper method for swapping
    static void swap(int []arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    //method for rotating an array
    static void rotateInPlace(int []arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
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
        System.out.print("enter K: ");
        int k=sc.nextInt();
        System.out.println("original array: ");
        printArray(array);
        rotateInPlace(array,k);
        System.out.println("the array after rotating by "+k+" is");
        printArray(array);
    }
}

