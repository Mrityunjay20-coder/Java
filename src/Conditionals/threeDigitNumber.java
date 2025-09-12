package Conditionals;
import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        //multiple condition using && and ||l
        if (n>99 && n<1000){
            System.out.println("The number is a three-digit number.");
        }
        else {
            System.out.println("The number is not a three-digit number.");
        }
    }
}
