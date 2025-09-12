package Loops;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int lastdigit=0;
        while(n!=0){
            lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        System.out.println("the sum of digits is :"+sum);
    }
}
