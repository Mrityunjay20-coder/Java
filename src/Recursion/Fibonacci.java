package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int prev=fibonacci(n-1);
        int prevPrev=fibonacci(n-2);
        return prev+prevPrev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("the "+n+"th term of fibonaaci is "+result);
    }
}