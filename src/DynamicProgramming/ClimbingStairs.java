package DynamicProgramming;

import java.util.Arrays;
//Question->count ways to reach nth stair.The person can climb either 1 or 2 stairs at a time..
public class ClimbingStairs {
    public static int climbingStairs(int n,int[]ways){
        if(n==0)return 1;
        if(n<0)return 0;
        if(ways[n]!=-1)return ways[n];
        ways[n]=climbingStairs(n-1,ways)+climbingStairs(n-2,ways);
        return ways[n];
    }
    public static int climbingStairsTabulation(int n){
        int []ways=new int[n+1];
        ways[0]=1;
        ways[1]=1;
        for(int i=2;i<=n;i++){
            ways[i]=ways[i-1]+ways[i-2];
        }
        return ways[n];
    }
    public static void main(String[] args) {
        int n=5;
        int []ways=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(climbingStairs(n,ways));
        System.out.println(climbingStairsTabulation(n));
    }
}
