package Matrix;

import java.util.Scanner;

public class MatrixSum {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //method for addition of two matrices
    static void arraySum(int[][] a,int r1,int c1,int [][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong input-addition not possible");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows of matrix1: ");
        int r1= sc.nextInt();
        System.out.print("enter the number of columns of matrix 1: ");
        int c1=sc.nextInt();
        int [][] array=new int[r1][c1];
        System.out.println("enter "+r1*c1+" elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the number of rows of matrix 2: ");
        int r2= sc.nextInt();
        System.out.print("enter the number of columns of matrix 2: ");
        int c2=sc.nextInt();
        int [][] brray=new int[r2][c2];
        System.out.println("enter "+r2*c2+" elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                brray[i][j]=sc.nextInt(); // corrected here
            }
        }
        System.out.println("Matrix 1");
        printArray(array);
        System.out.println("Matrix 2");
        printArray(brray);
        System.out.println("sum of 2 matrix is:");
        arraySum(array,r1,c1,brray,r2,c2);

    }
}