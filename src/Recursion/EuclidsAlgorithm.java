package Recursion;

import java.util.Scanner;

public class EuclidsAlgorithm {

    static int gcd(int x,int y){
        if (y==0) return x;
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of x:");
        int x=sc.nextInt();
        System.out.print("enter the value of y:");
        int y=sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
