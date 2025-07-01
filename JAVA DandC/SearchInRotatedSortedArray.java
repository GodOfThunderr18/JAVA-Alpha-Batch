public class SearchInRotatedSortedArray {
    public static int search(int a[],int target,int si,int ei){
        //base case
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        //case found
        if(a[mid]==target){
            return mid;
        }
        //mid on L1
        if(a[si]<=a[mid]){
            //case a:left of L1
            if(a[si]<=target&& target<a[mid]){
             return search(a,target,si,mid-1);
             }
             //case b:right of mid
             else{
            return search(a,target,mid+1,ei);
            }
        }
        //mid on L2
        else{
            //case c:right of L2
            if(a[mid]<target && target<=a[ei]){
                return search(a, target, mid+1, ei);
            }
            //case d:left of mid
            return search(a, target, si, mid-1);

        }

    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        int target=7 ;
        int tarIdx=search(a,target, 0, a.length-1);
        System.out.println(tarIdx);

    }
    
}
