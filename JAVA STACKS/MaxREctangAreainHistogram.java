import java.util.Stack;

public class MaxREctangAreainHistogram {  //O(n)
    public static void maxArea(int a[]){
        int maxArea=0;
        int nsr[]=new int[a.length];
        int nsl[]=new int[a.length];
        //Next smaller right O(n)
        Stack<Integer> s=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            int curr=a[i];
            while(!s.isEmpty()&&curr<=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=a.length; //special case
            }else{
                nsr[i]=s.peek(); //since we want index of next smallest and not the value
            }
            s.push(i);

        }

        //Next smaller left O(n)
        s=new Stack<>();
        for(int i=0;i<a.length;i++){
            int curr=a[i];
            while(!s.isEmpty()&&curr<=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1; //special case
            }else{
                nsl[i]=s.peek(); //since we want index of next smallest and not the value
            }
            s.push(i);

        }

        

        //current area width=j-i-1=nsr[i]-nsl[i]-1  O(n)
        for(int i=0;i<a.length;i++){
            int height=a[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Maximum area in histogram="+maxArea);


    }
        public static void main(String[] args) {
            int a[]={2,1,5,6,2,3};
            maxArea(a);
        
    }
    
}
