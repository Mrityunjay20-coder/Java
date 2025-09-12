package Array;

public class ReverseOfAnArray {
    //helper method for print
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //method for reversing an array with the help of another array
    static int[] reverseArray(int[]arr){
        int n=arr.length;
        int []ans=new int[n];
        int j=0;
        //traverse original array in reverse direction
        for(int i=n-1;i>=0;i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void swapInArray(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseInPlaceArray(int[]arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int[]ans=reverseArray(arr);
        System.out.print("the original array is: " );
        printArray(arr);
        System.out.print("the array after using an another array for reversing is: " );
        printArray(ans);
        System.out.print("the array without using an another array for reversing is: " );
        reverseInPlaceArray(arr);
        printArray(arr);
    }
}
