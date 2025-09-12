package Matrix;

import java.util.Scanner;

public class MatrixUserInput {
    //method for printing array
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int r= sc.nextInt();
        System.out.print("enter the number of columns: ");
        int c=sc.nextInt();
        int [][] array=new int[r][c];
        System.out.println("enter "+r*c+" elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("the elements of the array are: ");
        printArray(array);
    }
}
