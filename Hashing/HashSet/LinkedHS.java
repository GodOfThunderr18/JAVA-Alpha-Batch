package Hashing.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHS {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Hyderabad");
        hs.add("banglore");
        hs.add("Mumbai");
        hs.add("delhi");
        System.out.println(hs+" ");

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Hyderabad");
        lhs.add("banglore");
        lhs.add("Mumbai");
        lhs.add("delhi");
        System.out.println(lhs+" ");
        //operations and iteration same as hash set



    }
    
}
