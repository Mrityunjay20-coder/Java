package TCScode;

import java.util.Scanner;

//Given two integers a and b,your task is to determine the sum of the cubes of all numbers in the range from a to b.
public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your first number: ");
        int a=sc.nextInt();
        System.out.print("enter your second number: ");
        int b= sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=sum+i*i*i;  //most imp part
        }
        System.out.println(sum);
    }
}
