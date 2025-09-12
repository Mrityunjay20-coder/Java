package Stacks;

import java.util.Stack;
public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        //3 basic operation->push,pop and peek
        //push
        st.push(1);
        st.push(32);
        st.push(90);
        st.push(5);
        System.out.println(st.isEmpty());
        //peek
        System.out.println(st.peek());
        System.out.println(st);
        //pop
        st.pop();
        System.out.println(st);
        //size
        System.out.println("size is : "+st.size());

    }
}
