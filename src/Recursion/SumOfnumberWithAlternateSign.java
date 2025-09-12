 package Recursion;

import java.util.Scanner;

public class SumOfnumberWithAlternateSign {

    static int SeriesSum(int n){
        if(n==0)return 0;
        if(n%2==0){
            return SeriesSum(n-1)-n;
        }
        else{
            return SeriesSum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        System.out.println(SeriesSum(n));
    }
}
