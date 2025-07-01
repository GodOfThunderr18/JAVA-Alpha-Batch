 
public class Bubble_sort {

    public static void Bubblesort(int a[]){
        
        for(int i=0;i<=a.length-2;i++){
            for(int j=0;j<=a.length-2-i;j++){
                if(a[j]>a[j+1]){ //if u want descending order thn change the greater than to less than
                  int temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;

                }
            }  
        }
    }


    public static void main(String[] args) {
        int a[]={5,6,8,3,4};
        Bubblesort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
