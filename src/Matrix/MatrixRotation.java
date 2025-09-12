package Matrix;

import java.util.Scanner;

public class MatrixRotation {
    //printing an array method
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void arrayTransposeInPlace(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverseInPlace(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    //rotation of a square matrix by 90 degree
    static void rotate(int[][] array,int n){
        arrayTransposeInPlace(array,n,n);
        for(int i=0;i<n;i++){
            reverseInPlace(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows of matrix: ");
        int r = sc.nextInt();
        System.out.print("enter the number of columns of matrix : ");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        int totalElements = r * c;
        System.out.println("enter " + totalElements + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        printArray(array);
        rotate(array,r);
        System.out.println("rotate of matrix:");
        printArray(array);
    }
}
