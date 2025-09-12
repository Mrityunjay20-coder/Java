package Conditionals;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st side: ");
        double a = sc.nextDouble();
        System.out.print("Enter the 2nd side: ");
        double b = sc.nextDouble();
        System.out.print("Enter the 3rd side: ");
        double c = sc.nextDouble();
        if (a+b>c && b+c>a && a+c>b){
            System.out.println("It is a triangle");
        }
        else {
            System.out.println("It is not a triangle");
        }
    }
}
