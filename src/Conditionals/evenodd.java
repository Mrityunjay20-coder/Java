package Conditionals;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        //condition for even odd
        if (n % 2 == 0) {
            System.out.println("the entered number is even");
        }
        else {
            System.out.println("the entered number is odd");
        }
    }
}
