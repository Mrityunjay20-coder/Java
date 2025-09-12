package javaInput;
import java.util.Scanner;
public class sumOf2numbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum is: " + sum);
    }
}
