package Array;
import java.util.Scanner;
public class SumPair {
    //method to call for pairsum
    static int pairSum(int[]arr,int x){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        return ans;
    }
    //taking array input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("enter array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("the elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("enter target sum:");
        int x=sc.nextInt();
        System.out.println("the no of pairs whose sum is "+x +" is "+(pairSum(array,x)));
    }
}
