package Strings;
import java.util.*;
public class Builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append("world");
        System.out.println(str);//helloworld
        str.setCharAt(0,'m');
        System.out.println(str);//melloworld
        str.insert(2,'y');
        System.out.println(str);//meylloworld
        str.deleteCharAt(2);
        System.out.println(str);//melloworld
        StringBuilder sb=new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
