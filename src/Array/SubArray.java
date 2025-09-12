package Array;

public class SubArray {
    //subarray->continuous part of array
    static void subArray(int[]numbers){

        //3 loops
        for(int i=0;i< numbers.length;i++){
            //start->i
            for(int j=i;j<numbers.length;j++){
                //end->j
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]number={2,4,6,8,10};
        subArray(number);
    }
}
