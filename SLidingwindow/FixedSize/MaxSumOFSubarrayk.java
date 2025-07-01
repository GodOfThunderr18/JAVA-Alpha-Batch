package SLidingwindow.FixedSize;

public class MaxSumOFSubarrayk {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7,8};
        int k=3;
        int sum=0;
        int ms=0;
        int i=0,j=0;
        while(j<a.length){

            sum+=a[j];
            if(j-i+1<k){
                j++;
            }
            if(j-i+1==k){
              ms=Math.max(ms,sum);
              sum-=a[i];
              i++;
              j++;
            }
        }
        System.out.println(ms);
    }
    
}
