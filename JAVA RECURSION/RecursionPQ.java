/*public class RecursionPQ {
    public static void findKeyidx(int a[],int idx,int key){
        //base case
        if(idx==a.length){
            return;
        }
        //work
        if(a[idx]==key){
          System.out.print(idx+" ");
        }
         findKeyidx(a, idx+1, key);
    }
    public static void main(String[] args) {
        int a[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        findKeyidx(a, 0, key);
    }
    
}*/

//** 


/**
 * RecursionPQ
 */
/*public class RecursionPQ {
     
    public static void printDigits(int n){
        if(n==0){
            return;
        }
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int LD=n%10;
        
        printDigits(n/10);
        System.out.print(digits[LD]+" ");
        


    }

    public static void main(String[] args) {
        printDigits(2010);
    }
}*/



  //Tower of hanoi
  
  public class RecursionPQ {
    public static void TowerofHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk 1 from " + src + " to " + dest);
            return;
        }
        TowerofHanoi(n-1,src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        TowerofHanoi(n-1,helper,src, dest);

    }
  
    public static void main(String[] args) {
      TowerofHanoi(3,"A","B","C");
    }
  }