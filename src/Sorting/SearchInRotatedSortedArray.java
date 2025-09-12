package Sorting;

public class SearchInRotatedSortedArray {
    public static int search(int []arr,int tar,int si,int ei){
        if(si>ei) return -1;//base case
        //kaam
        int mid=si+(ei-si)/2;
        //case1
        if(arr[mid]==tar){
            return mid;
        }

        //mid lies on l1
        if(arr[si]<=arr[mid]){
            //case A:left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid);
            }else{
                //case B:right
                return search(arr,tar,mid+1,ei);
            }
        }
        //mid lies on l2
        else{
            //case C:right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr,tar,mid+1,ei);
            }else{
                //case D:left
                return search(arr,tar,si,mid-1  );
            }
        }
    }
    public static void main(String[] args) {
        int []array={4,5,6,7,0,1,2};
        int target=0;
        int tarIdx=search(array,target,0, array.length-1);
        System.out.println(tarIdx);
    }
}
