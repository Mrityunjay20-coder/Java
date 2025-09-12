package Array;

import java.util.Scanner;

public class RotateAnArray {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        int []ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
         ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
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
        System.out.print("enter K: ");
        int k=sc.nextInt();
        System.out.println("original array: ");
        printArray(array);
        int[]ans=rotate(array,k);
        System.out.println("the array after rotating by "+k+" is");
        printArray(ans);
    }
}
