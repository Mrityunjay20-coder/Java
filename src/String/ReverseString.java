package String;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String original){
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        return reverse;
    }
    public static String reverseRecursion(String s,int idx){
        if(idx==s.length())return "";
        String smallAns=reverseRecursion(s,idx+1);
        return smallAns+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original= sc.nextLine();
        System.out.println(reverse(original));
        System.out.println(reverseRecursion(original,0));
    }
}
