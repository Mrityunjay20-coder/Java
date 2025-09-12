package Sorting;

public class SelectionSort {
    static void selectionSort(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                //sign change->decreasing order
                if (a[j]<a[min_index]){
                    min_index=j;
                }
            }
            //swap in outer loop
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int []a={5,3,7,2,1};
        selectionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
