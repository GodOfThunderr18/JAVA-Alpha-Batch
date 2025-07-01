package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Iteration {

    public static void main(String[] args) {
         HashMap<String,Integer> hm=new HashMap<>();
        
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("US", 90);
        hm.put("Nepal", 50);
        hm.put("Indonesia", 70);
        
        //first make a set of keys
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        //run a for each loop on this set
        for (String k : keys) {
            
            System.out.println("key= "+k+", value= "+hm.get(k));
            
        }
        
        
    }
    
}
