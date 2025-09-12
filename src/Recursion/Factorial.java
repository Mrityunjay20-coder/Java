package Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        //base case
        if(n==0) return 1;
        //recursive work
        int smallAns=factorial(n-1);
        //self work
        return n*smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int result=factorial(n);
        System.out.println("the factorial of "+ n + " is: "+result);
    }
}
