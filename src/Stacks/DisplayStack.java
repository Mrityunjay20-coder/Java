package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {
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
       // System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x=rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        int m=st.size();
        int []arr=new int[m];
        for(int i=m-1;i>=0;i--){
            arr[i]=st.pop();
        }
        System.out.println();
        for(int i=0;i<m;i++){
            int x=arr[i];
            System.out.print(arr[i]+" ");
            st.push(x);
        }
    }
}
