package OOPSinJAVA;
import java.util.Scanner;
class Difference {
    int minus(int a,int b){
        int ans=a-b;
        return ans;
    }
}

public class DifferenceOfTwoNumber {
    public static void main(String[] args) {
        Difference obj=new Difference();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int x = sc.nextInt();
        System.out.print("Enter second number");
        int y = sc.nextInt();
        int res=obj.minus(x,y);
        System.out.println("difference of 2 no is :" +res);
    }
}
