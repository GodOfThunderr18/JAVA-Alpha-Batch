package Hashing;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India", 20);
        tm.put("China", 100);
        tm.put("US", 50);
        System.out.println(tm); //sorted order accoording to alphabets
    }
    
}
