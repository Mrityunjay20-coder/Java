package Hashmap;

import java.util.*;

public class Iterations {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",150);
        hm.put("China",200);
        hm.put("Bangladesh",60);
        hm.put("SriLanka",45);
        hm.put("Afghanistan",55);
        //iterate
        Set<String>keys=hm.keySet();
        //System.out.println(keys);
        for(String k:keys){
            System.out.println("key="+k+",value="+hm.get(k));
        }
    }
}
