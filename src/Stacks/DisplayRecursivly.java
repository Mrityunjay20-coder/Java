package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DisplayRecursivly {
    public static void displayrevrecursively(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayrevrecursively(st);
        st.push(top);
    }
    public static void displayrecursively(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top=st.pop();
        displayrecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("enter the no of elements ");
        n = sc.nextInt();
        System.out.println("enter the elements: ");
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        displayrevrecursively(st);
        System.out.println();
        displayrecursively(st);
    }
}
