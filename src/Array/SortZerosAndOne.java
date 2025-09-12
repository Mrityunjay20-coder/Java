package Array;

import java.util.Scanner;
public class SortZerosAndOne {
    //printing an array
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //swapping an array
    static void swap(int []arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    //2 pointer approach
    //moving zeros and one
    static void ZerosAndOne(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
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
            ZerosAndOne(array);
            System.out.println("SORTED ARRAY IS: ");
            printArray(array);
        }
    }
