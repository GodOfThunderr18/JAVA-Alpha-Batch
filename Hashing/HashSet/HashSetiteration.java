package Hashing.HashSet;


import java.util.HashSet;
import java.util.Iterator;
public class HashSetiteration {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Hyderabad");
        hs.add("banglore");
        hs.add("Mumbai");
        hs.add("delhi");
        // Iterator it=hs.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        
        for (String city : hs) {
            System.out.println(city);
            
        }
    }
    
}


