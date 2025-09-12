package Array;

import java.util.Arrays;
import java.util.Scanner;

//swap method,reverse method,main method for decision
public class ArraySquare {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
    static void reverse(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int [] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int [] ans=new int[n];
        int k=0;

        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k++;
                left++;
            }
            else{
                ans[k]=arr[right]*arr[right];
                k++;
                right--;
            }
        }
        return ans;
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
        int[] ans=sortSquares(array);
        System.out.println("square of array in non decreasing order is : ");
        reverse(ans);
        printArray(ans);
    }
}
