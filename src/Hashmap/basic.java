package Hashmap;

import java.util.HashMap;

public class basic {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //Insert
        hm.put("India",150);
        hm.put("SriLanka",35);
        hm.put("China",150);
        hm.put("Bangladesh",50);
        System.out.println(hm);
        //get
        System.out.println(hm.get("India"));
        //contains
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Pakistan"));
        //remove
        System.out.println(hm.remove("China"));
        //size
        System.out.println(hm.size());
    }
}
