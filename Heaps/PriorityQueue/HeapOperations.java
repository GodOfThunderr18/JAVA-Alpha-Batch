package Heaps.PriorityQueue;

import java.util.ArrayList;

public class HeapOperations {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        //Insert
        public void add(int data){  //O(logn)
            //add at last index
            arr.add(data);

            //Fix heap if required
            //parent idx
            int x=arr.size()-1; //since the newly inserted node is added at last index of AL hence child index is at last index
            int par=(x-1)/2;

            while(x>0 && arr.get(x)<arr.get(par)){  //O(logn)  //change get(x)>get par for MAX HEAP
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                // After swapping, x is moved to the parent's position, and par is recalculated to continue checking up the heap.
                x=par;
                par=(x-1)/2;
            }
        }

        
        //peek
        public int peek(){
            return arr.get(0);
        }


        //Remove
        public void heapify(int i){  //O(logn)
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){ //left<arr.size is for boundary condition i.e for leaf nodes
                minIdx=left;
            }                                   //for MAXHEAP reverse the conditions for both these statments...the minIdx should be read as maxIdx          
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }
            // after checking above two conditions and now if our minIdx is not the rootidx i.e i as declared earlier that means any of above conditions was true and our minIdx was updated then we have to swap
            if(minIdx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                //now after this swap if the position where the minIdx was swaapped gets heap disrupted then again we should heapify
                heapify(minIdx);

            }
        }

        public int remove(){  //O(logn)
            int data=arr.get(0); //store the element which we are removing

            //swap 1st and last node
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //delete last node
            arr.remove(arr.size()-1);

            //fix heap
            heapify(0);  //called heapify for root i.e rootidx=0
            return data; 

        }


        public boolean isEmpty(){
            return arr.size()==0;
        }


          
    }

    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
    
}




