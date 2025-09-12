package Array;

import java.util.Scanner;

public class LastIndex {
    static int lastOccurence(int[]arr,int x){
        int lastIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex=i;
            }
        }
        return lastIndex;
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
        System.out.print("the elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("enter x:");
        int x=sc.nextInt();
        System.out.println("last Occurence of x: "+lastOccurence(array,x));
    }
}

