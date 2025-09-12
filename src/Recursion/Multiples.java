package Recursion;

import java.util.Scanner;

public class Multiples {
    static void multiples(int n,int k){
       if(k==0) return;
       multiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        System.out.print("enter the value of k:");
        int k=sc.nextInt();
        multiples(n,k);
    }
}
