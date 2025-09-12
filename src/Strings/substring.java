package Strings;
import java.util.*;
public class substring {
    public static void main(String[] args) {
        String str="abcd"; //0 to 3
        for (int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
//in java strings are immutable