package Loops;
import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int r=0;
        while(n>0){
            r=r+(n%10);
            r=r*10;
            n=n/10;
        }
        r=r/10;
        System.out.println("The reversed number is: "+r);
    }
}
