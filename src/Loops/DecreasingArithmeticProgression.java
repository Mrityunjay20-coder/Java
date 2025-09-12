package Loops;
import java.util.Scanner;
public class DecreasingArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int a=100;
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a=a-3;
        }
    }
}
