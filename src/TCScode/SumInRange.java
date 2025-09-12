package TCScode;

import java.util.Scanner;

//Question->Given a range [m,n] (both inclusive) where 0<=m,n<=10000,find the sum of all integers between m and n.
//Example:
//Input:0 3
//Output-6
public class SumInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number: ");
        int a=sc.nextInt();
        System.out.println("enter second number: ");
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=sum+i; //most imp
        }
        System.out.println("The sum of numbers between a and b is: "+sum);
    }
}
