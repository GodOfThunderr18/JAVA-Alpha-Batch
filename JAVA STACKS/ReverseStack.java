import java.util.*;
public class ReverseStack {
    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop(); //remove top
        reverseStack(s); //continue for next elements 
        PushAtBottom(s,top);//while cmng down add the top element at bottom one by one
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    } 
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
       
        reverseStack(s);

        printStack(s);
        
    }
    
}
