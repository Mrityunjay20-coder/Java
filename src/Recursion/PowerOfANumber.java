package Recursion;

public class PowerOfANumber {
    static int power(int p,int q){
        if(q==0)return 1;
        int smallAns=power(p,q-1);
        return smallAns*p;
    }
    //optimised method....less no of calls
    static int pow(int p,int q){
        if(q==0)return 1;
        int smallPow=pow(p,q/2);
        if(q%2==0){
            return smallPow*smallPow;
        }
        return p*smallPow*smallPow;
    }
    public static void main(String[] args) {
       // System.out.println(power(5,4));
        System.out.println(pow(5,5));
    }
}
