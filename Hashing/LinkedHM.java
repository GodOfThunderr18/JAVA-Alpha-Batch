package Hashing;

import java.util.LinkedHashMap;

public class LinkedHM {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India", 20);
        lhm.put("China", 100);
        lhm.put("US", 50);
        System.out.println(lhm); //inserion ordered output will come
        
    }
    
}
