package Array;

public class LinearSearch {
    static int linearSearch(int[]array,int key){
        for(int i=0;i< array.length;i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={23,34,45,56,67,78};
        int key=45;
        int index=linearSearch(array,key);
        if(index==-1) System.out.println("key not found");
        else System.out.println("key is found at: "+index);
    }
}
