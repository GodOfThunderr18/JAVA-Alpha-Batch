
public class MergeSort {

    public static void mergeSort(int a[],int si,int ei){
        //base
        if(si>=ei){
            return;
        }
        //work
        int mid=si+(ei-si)/2; 
        mergeSort(a, si, mid); //left part
        mergeSort(a, mid+1, ei);//right part

        merge(a,si,mid,ei);
    }
    public static void merge(int a[],int si,int mid,int ei){
         int temp[]=new int[ei-si+1];  //left(0,3)=4 right(4,6)=3 total=7 -->6-0+1
         int i=si; //iterator for left part
         int j=mid+1; //iterator for right part
         int k=0; //iterator for temp array
           while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k]=a[i];
                i++;k++;
            }else{
                temp[k]=a[j];  
                j++;k++;
            }
           }

           //if left part have some leftover elements and right part is finished
           while(i<=mid){
            temp[k++]=a[i++];
           }
          //if right part have some leftover elements and left part is finished
          while(j<=ei){
            temp[k++]=a[j++];
          }
          //copy temp array elemnts into original array
          for(k=0,i=si;k<temp.length;k++,i++){
            a[i]=temp[k];
          }
    }

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={6,3,9,9,2,8};
        mergeSort(a,0,a.length-1);
        printArray(a);
        

        }
        
    }
    

   