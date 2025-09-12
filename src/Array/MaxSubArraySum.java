package Array;

public class MaxSubArraySum {
    //BRUTE FORCE APPROACH->O(n^3)
    public static void maxSubArraysSum(int []numbers){
       // int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<= numbers.length;i++){
            for(int j=i;j< numbers.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                   currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= "+maxSum);
    }
    //PREFIXSUM METHOD->O(n^2)
    public static void prefixSubArraySum(int[]numbers){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int []prefix=new int[numbers.length];
        //calculate prefix array
        prefix[0]=numbers[0];
        for(int i=1;i< prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<= numbers.length;i++) {
            for (int j = i; j < numbers.length; j++) {
                currSum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= "+maxSum);
    }
    //KADANE'S ALGORITHM->O(n)
    public static void kadanes(int[]numbers){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i< numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("our max subarray sum is "+maxSum);
    }
    public static void main(String[] args) {
        int[]numbers={-2,-3,4,-1,-2,1,5,-3};
        //maxSubArraysSum(numbers);
        //prefixSubArraySum(numbers);
        kadanes(numbers);
    }
}
