public class QuickSort {
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }

        int pIdx=partition(a,si,ei);
        quickSort(a, si, pIdx-1);
        quickSort(a, pIdx+1, ei);
    }
    public static int partition(int a[],int si,int ei){
        int pivot=a[ei];
        int i=si-1; //to make place for elemnts less than pivot

        for(int j=si;j<ei;j++){  //traversing in original array
            if(a[j]<pivot){
                i++;
                //swap
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        } 
        //now all elements are in correct poasition excpet pivot 
        //changing pivot to its correct position
        i++;
        int temp=pivot;
         a[ei]=a[i]; //its not pivot=a[i]  since pivot is an elemnt and not a position and we took ei elemnt as pivot hence ei index position is used here    
        a[i]=temp;
        return i;

    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
         int a[]={6,3,5,8,2,5};
        quickSort(a, 0, a.length-1);
        printArray(a);
        
    }
    
}
