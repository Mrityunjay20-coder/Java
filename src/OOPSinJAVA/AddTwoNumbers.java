package OOPSinJAVA;
import java.util.Scanner;
class Algebra{
    int sum(int a,int b){
        return a+b;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Algebra obj=new Algebra();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int x = sc.nextInt();
        System.out.print("Enter second number");
        int y = sc.nextInt();
        int res=obj.sum(x,y);
        System.out.println("sum of 2 no is :" +res);
    }
}
