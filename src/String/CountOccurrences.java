package String;

import java.util.Scanner;

public class CountOccurrences {
    public static String removeA(String s,int idx){
        if(idx==s.length())return "";
        String smallAns=removeA(s,idx+1);
        char curr=s.charAt(idx);
        if(curr=='a'||curr=='A'){
            return smallAns;
        }else{
            return curr+smallAns;
        }
    }
    public static String removeA2(String s){
        if(s.isEmpty())return "";
        String smallAns=removeA2(s.substring(1));
        char curr=s.charAt(0);
        if(curr=='a'||curr=='A'){
            return smallAns;
        }else{
            return curr+smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
