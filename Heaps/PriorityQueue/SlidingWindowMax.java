package Heaps.PriorityQueue;

import java.util.PriorityQueue;

public class SlidingWindowMax {
    static class Pair implements Comparable<Pair>{
        int value;
        int idx;
        Pair(int value,int idx){
            this.value=value;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            //we want descending order of values
            return p2.value-this.value;
        }

    }

    public static void main(String[] args) {
        int a[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[a.length-k+1]; //n-k+1

        PriorityQueue<Pair> pq=new PriorityQueue<>();
        //add first window elements first
        for(int i=0;i<k;i++){
            pq.add(new Pair(a[i], i));
        }

        //add first window answer in res
        res[0]=pq.peek().value;
        //now for rest of the windows check the condition
        for(int i=k;i<a.length;i++){  
            while(pq.size()>0 && pq.peek().idx<=i-k){
                pq.remove(); //if the peek of pq is not part of window then remove it
            }
            pq.add(new Pair(a[i], i)); //add the new pair to the pq 
            res[i-k+1]=pq.peek().value; //here i is starting from 3 but we want res idx from 1 -->3-3+1=1
        }

        //orint resukt
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
