
//Merge sort on strings
/*public class DnCPractiseQuestions {
    public static void mergeSort(String a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(a, si, mid);
        mergeSort(a, mid+1, ei);
        merge(a,si,mid,ei);
    }
    public static void merge(String a[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(a[i].compareTo(a[j])<1){
                temp[k]=a[i];
                k++;
                i++;
            }else{
                temp[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=ei){
            temp[k++]=a[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            a[i]=temp[k];
          }
    }
    public static void printArray(String a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
          String a[]={"sun","earth","mars","mercury"};
          mergeSort(a, 0, a.length-1);
          printArray(a);
    }
}*/


// 
