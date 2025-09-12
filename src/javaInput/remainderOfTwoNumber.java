package javaInput;
import java.util.Scanner;
public class remainderOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int remainder = a%b;
        System.out.println("The remainder of two numbers is "+remainder);
    }
}
