package Conditionals;
import java.util.Scanner;
public class greatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println("The 1st no is greatest");
        }
        else if (n2>n1 && n2>n3){
            System.out.println("The 2nd no is greatest");
        }
        else {
            System.out.println("The 3rd no is greatest");
        }
    }
}
