package Conditionals;
import java.util.Scanner;
public class nestedthreeandfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n%5==0){
            if (n%3==0){
                System.out.println("the no is divisible by 3 and 5 both");
            }
            else{
                System.out.println("the no is not divisible by 5 and 3");
            }
        }
        else{
            System.out.println("not divisible");
        }
    }
}
