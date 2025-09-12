package Loops;
import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int num =1;
        while (num <= n) {
            System.out.println(num);
            sum = sum + num;
            num++;
        }
        System.out.println("the sum of n number is :"+sum);
    }
}
