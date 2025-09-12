package Recursion;

import java.util.Scanner;

public class IncreasingNumber {
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        printIncreasing(n);
    }
}
