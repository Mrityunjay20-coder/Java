package Queue;

import java.util.*;
public class basics {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        //System.out.println(q.isEmpty());
        q.add(1); //add in queue=push in LL
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.size());
        q.remove(); //remove/poll in queue=pop in LL
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek()); //peek is same in both queue and LL

    }
}
