package Hashing.HashSet;

import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int nums[]={4,3,4,3,5,6,2,7,2,1};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        System.out.println(hs.size() );
    }
    
}
