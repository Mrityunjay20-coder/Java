package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IndianCoins {
    public static void main(String[] args) {
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Collections.reverseOrder());
        int amount=1059;
        int count=0;

        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("total (minimum) count is: "+count);
        for(int i=0;i< ans.size();i++){
            System.out.print(ans.get(i)+"   ");
        }
        System.out.println();
    }
}
