package Conditionals;
import java.util.Scanner;
public class costPricesellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CP: ");
        double CP = sc.nextDouble();
        System.out.print("Enter the SP: ");
        double SP = sc.nextDouble();
        if (SP>CP){
            System.out.print("Your profit is :");
            System.out.println(SP-CP);
        }
        else if (SP<CP){
            System.out.println("Your loss is :");
            System.out.println(CP-SP);
        }
        else {
            System.out.println("no profit no loss");
        }
    }
}
