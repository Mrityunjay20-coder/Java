package Sorting;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=1;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out correct posn to insert
            //arr[prev]sign change->dec order
            while (prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
  
        }
    }
    public static void main(String[] args) {
        int []arr={2,1,4,3,5,7};
        insertionSort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
