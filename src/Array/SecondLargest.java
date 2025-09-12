package Array;

import java.util.Scanner;

public class SecondLargest {
    static int findMax(int[]arr){
        int mx=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int findSecondMax(int[]arr){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return secondMax;
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
        System.out.println();
        System.out.println("maximum element in the array is: "+findMax(array));
        System.out.println("second maximum element in the array is: "+findSecondMax(array));

    }
}