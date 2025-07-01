package SLidingwindow.VariableSize;

public class LongestSubarraywithSumk {
    public static void main(String[] args) {
          int a[]={4,1,1,1,1,2,3,5};
          int k=5;
          int i=0,j=0,sum=0,max=0;
          while(j<a.length){
            sum+=a[j];
            if(sum<k){
                j++;
            }else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            }else{
                while(sum>k){
                    sum-=a[i];
                    i++;
                }    

                // ✅ Check again after shrinking
                if (sum == k) {
                    max = Math.max(max, j - i + 1);
                }
                
                
                j++;
            }
          }
          System.out.println(max);
          
    }
    
}

