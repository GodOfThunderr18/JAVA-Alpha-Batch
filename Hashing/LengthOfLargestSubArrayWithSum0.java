package Hashing;

import java.util.HashMap;

public class LengthOfLargestSubArrayWithSum0 {
    public static void main(String[] args) {
        int a[]={15,-2,2,-8,1,7,10,23};
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<a.length;j++){
            sum+=a[j];
            if(map.containsKey(sum)){
                max=Math.max(max, j-map.get(sum));
            }else{
                map.put(sum, j);
            }

        }
        System.out.println(max);
    }
    
}
