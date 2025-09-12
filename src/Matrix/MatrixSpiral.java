package Matrix;

import java.util.Scanner;

public class MatrixSpiral {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] array,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            //topRow->leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.print(array[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //rightCol->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.print(array[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //bottomRow ->rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.print(array[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //leftCol->bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(array[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
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
        System.out.println("the spiral of the given array is: ");
        printSpiralOrder(array,r,c);
    }
}