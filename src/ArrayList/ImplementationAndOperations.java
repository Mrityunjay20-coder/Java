package ArrayList;
import java.util.*;
public class ImplementationAndOperations {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list );
        //GET OPERATION=O(1)
        int element= list.get(2);
        System.out.println(element);
        //set
        list.set(2,10);
        System.out.println(list);
        //delete
        list.remove(2);
        System.out.println(list);
        //contains
        System.out.println(list.contains(5));
        System.out.println(list.contains(15));
    }
}
