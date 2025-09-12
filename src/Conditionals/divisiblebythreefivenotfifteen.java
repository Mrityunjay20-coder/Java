package Conditionals;
import java.util.Scanner;
public class divisiblebythreefivenotfifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n%5==0 || n%3==0){
            if (n%15!=0){
                System.out.println("Divisible by 3 and 5 but not divisible by 15");
            }
            else{
                System.out.println("not matching the required conditions");
            }
        }
        else{
            System.out.println("not matching the required conditions");
        }
    }
}
