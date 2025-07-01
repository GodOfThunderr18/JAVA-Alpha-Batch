package Heaps.PriorityQueue;

public class HeapSort {

    public static void heapify(int i,int size,int a[]){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if(left<size && a[left]>a[maxIdx]){
            maxIdx=left;
        }
        if(right<size && a[right]>a[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            //swap
            int temp=a[i];
            a[i]=a[maxIdx];
            a[maxIdx]=temp;

            heapify(maxIdx, size, a);
        }

    }

    public static void heapSort(int a[]){  //O(nlogn)
        //step 1 max heap
        int n=a.length;
        for(int i=n/2;i>=0;i--){
            heapify(i,n,a); //heapify takes logn time-->its called for n/2 times=TC becomes n/2*logn-->O(nlogn)

        }

        //step 2  push largest to last
        for(int i=n-1;i>0;i--){ //decreases heap size 
            //swap first and last elements
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;

            //call heapify for root node 
            heapify(0,i,a);   //O(nlogn)

        }
    }

    public static void main(String[] args) {
        int a[]={1,2,4,5,3};
        heapSort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
}
