package javaInput;
import java.util.Scanner;
public class squareOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int square = num*num;
        System.out.println("The square of " + num + " is " + square);
    }
}
