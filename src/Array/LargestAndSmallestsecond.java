package Array;

public class LargestAndSmallestsecond {
    public static int secondlargest(int[]nums){
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int number:nums){
            if(number>firstLargest){
                secondLargest=firstLargest;
                firstLargest=number;
            }else if(number>secondLargest && number<firstLargest){
                secondLargest=number;
            }
        }
        return secondLargest;
    }
    public static int secondSmallest(int[]nums){
        int firstSmallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int number:nums){
            if(number<firstSmallest){
                secondSmallest=firstSmallest;
                firstSmallest=number;
            }else if(number<secondSmallest && number>firstSmallest){
                secondSmallest=number;
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[]arr={23,34,45,56,67};
        System.out.println(secondlargest(arr));
        System.out.println(secondSmallest(arr));
    }
}
