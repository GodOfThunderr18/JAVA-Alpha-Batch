import java.util.Stack;

/*public class NextGreater {
    public static void nextGreater(int a[],int nextG[]){
        Stack<Integer> s=new Stack<>();
        int n=a.length;
        nextG[n-1]=-1;
        s.push(n-1);
        for(int i=n-2;i>=0;i--){
            int curr=a[i];
            while(!s.isEmpty() && curr>=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=a[s.peek()];
            }
            s.push(i);
        

        }
    }
    public static void main(String[] args) {
        int a[]={6,0,8,1,3};
        int nextG[]=new int[a.length];
        nextGreater(a, nextG);
        for(int i=0;i<nextG.length;i++){
            System.out.print(nextG[i]+" ");
        }
    }
    
}
*/


public class NextGreater {
    public static void nextGreater(int a[],int nextG[]){
        Stack<Integer> s=new Stack<>();
        int n=a.length;
        
        for(int i=n-1;i>=0;i--){
            int curr=a[i];
            while(!s.isEmpty() && curr>=a[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }else{
                nextG[i]=a[s.peek()];
            }
            s.push(i);
        

        }
    }
    public static void main(String[] args) {
        int a[]={6,0,8,1,3};
        int nextG[]=new int[a.length];
        nextGreater(a, nextG);
        for(int i=0;i<nextG.length;i++){
            System.out.print(nextG[i]+" ");
        }
    }
    
}
