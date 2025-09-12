package Matrix;
import java.util.Scanner;
public class MatrixTranspose {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] arrayTranspose(int[][] arr,int r,int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    //optimised code
    static void arrayTransposeInPlace(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows of matrix: ");
        int r = sc.nextInt();
        System.out.print("enter the number of columns of matrix : ");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        int totalElements=r*c;
        System.out.println("enter " + totalElements + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        printArray(array);
        System.out.println("the transpose of a matrix is:");
        int[][] ans=arrayTranspose(array,r,c);
        printArray(ans);
        arrayTransposeInPlace(array,r,c);
        printArray(array);
    }
}
