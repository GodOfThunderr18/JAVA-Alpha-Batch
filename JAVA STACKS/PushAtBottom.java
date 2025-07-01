import java.util.*;
public class PushAtBottom {
    public static void PushAtBottom(Stack<Integer> s,int data){
        //base case
        if(s.isEmpty()){
            //whn stack gets empty,add the new data so that it becomes our bootom most elemnt of stack
            s.push(data);
            return;
        }
        int top=s.pop();//first we store the top elemnt in top variabile and remove it
        PushAtBottom(s, data);//continue the same for rest elements
        //after it ggets empty base case executes and the new element gets added at bottom,now in next step add remaining elemenst which we stored previusly in top
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);



       PushAtBottom(s,4);

      while(!s.isEmpty()){
        System.out.println(s.pop());
      }
    }
    
}
