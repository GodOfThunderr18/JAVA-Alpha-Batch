package Hashing.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Hyderabad");
        hs.add("Banglore");
        hs.add("Mumbai");
        hs.add("Delhi");
        System.out.println(hs+" ");

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Hyderabad");
        lhs.add("Banglore");
        lhs.add("Mumbai");
        lhs.add("Delhi");
        System.out.println(lhs+" ");

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Hyderabad");
        ts.add("Banglore");
        ts.add("Mumbai");
        ts.add("Delhi");
        System.out.println(ts+" ");

    }
    
}
