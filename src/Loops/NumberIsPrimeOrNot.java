package Loops;
import java.util.Scanner;
public class NumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a=0;
        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                a=1;
                break;
            }
        }
        if(a==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
