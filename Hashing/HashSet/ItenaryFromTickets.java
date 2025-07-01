package Hashing.HashSet;

import java.util.HashMap;

public class ItenaryFromTickets {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();
        //add to as key and from as values in revMap
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }
        //now check for req value
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        //this should never be reached
        return null;

    }
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("Delhi", "Banglore");
        hm.put("Hyderabad", "Delhi");
        hm.put("Mumbai", "Goa");
        hm.put("Goa ", "Hyderabad");
        String start=getStart(hm);
        System.out.print(start);
        
        for (String k : hm.keySet()) {
            System.out.print("->"+hm.get(start));
            start=hm.get(start);
        }
    }
    
}
