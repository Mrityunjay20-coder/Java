package Sorting;

public class BubbleSort {
//method for bubble sort
    static void bubblesort(int [] array){
        int n= array.length;
        for(int i=0;i<n-1;i++){ //outer loop
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){ //inner loop
                //sign change->decreasing order
                if(array[j]>array[j+1]){
                    //swap function
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
            int [] array={4,2,6,1,7,3};
            bubblesort(array);
            for(int i:array){
                System.out.print(i+" ");
            }
    }
}
