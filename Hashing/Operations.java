package Hashing;

import java.util.HashMap;

public class Operations {

    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //to insert data
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("US", 90);

        System.out.println(hm); //output will be unordered

        //get 
        int population=hm.get("US");
        System.out.println("Population of US: "+population);

        //Containskey
        System.out.println(hm.containsKey("India")); //keys are case sensitive 
        System.out.println(hm.containsKey("india"));

        //remove
        System.out.println(hm.remove("China"));  //120 will be returned
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //is empty
        System.out.println(hm.isEmpty());
        //clear-it clears entire hashmap
        hm.clear();
        System.out.println(hm.isEmpty()); 
    }
    
}
