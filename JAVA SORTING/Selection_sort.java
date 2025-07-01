
public class Selection_sort {
    public static void selectionsort(int a[]){
        for(int i=0;i<a.length-1;i++){  //for(int i=0;i<=a.length-2,i++)
            int minPos=i;
            for(int j=i+1;j<a.length;j++){  //for(int j=0;j<=a.length-1,j++)
                
                if(a[j]<a[minPos]){      //if u want decreasing order then c hange the less than to greater than symbol
                    minPos=j;
                }
            
            }
            //swap
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
    }



     public static void main(String args[]){
        int a[]={5,6,8,3,4};
        selectionsort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

     }
}
