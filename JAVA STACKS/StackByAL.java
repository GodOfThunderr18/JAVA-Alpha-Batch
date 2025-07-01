import java.util.ArrayList;

public class StackByAL {
    public static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        //to check wherher stack is empty
        public static boolean isEmpty(){
            return list.size()==0; //return true if list is empty else returns false
        }

        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1; //if stack is empty then we cant remove any element hence return -1
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top; //return the top element which u removed.
            } 
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1; //if stack is empty then we cant peek any element hence return -1
            }
           return list.get(list.size()-1);
            }
    }
            public static void main(String[] args) {
                Stack s=new Stack();
                s.push(1);
                s.push(2);
                s.push(3);

                while(!s.isEmpty()){  //i.e until isempty is false this loop runs
                   System.out.println(s.peek());
                   s.pop();
                     
                }

              
        
    }
    
}
