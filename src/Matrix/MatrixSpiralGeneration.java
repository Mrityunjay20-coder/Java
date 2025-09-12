package Matrix;

import java.util.Scanner;

public class MatrixSpiralGeneration {
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralOrder(int n) {
        int[][] array = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;
        while (current <= n * n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                array[topRow][j] = current;
                current++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                array[i][rightCol] = current;
                current++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                array[bottomRow][j] = current;
                current++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                array[i][leftCol] = current;
                current++;
            }
            leftCol++;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.nextLine(); // Add this line to consume the newline character
        int[][] a = generateSpiralOrder(n);
        System.out.println("Spiral Matrix:");
        printArray(a);
    }
}