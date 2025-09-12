package Matrix;

import java.util.Scanner;

public class MatrixRectangleSum {
    static int findsum(int[][]array,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++) {
                sum += array[i][j];
            }
        }
            return sum;
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
        System.out.println("enter the sides of the rectangle:");
        System.out.print("enter l1: ");
        int l1=sc.nextInt();
        System.out.print("enter r1: ");
        int r1=sc.nextInt();
        System.out.print("enter l2: ");
        int l2=sc.nextInt();
        System.out.print("enter r2: ");
        int r2=sc.nextInt();
        System.out.println("the sum of the rectangle is "+findsum(array,l1,r1,l2,r2));
    }
}