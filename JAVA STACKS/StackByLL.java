public class StackByLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
   public static class Stack{
   // static Node head=null;
    public static boolean isEmpty(){
        return head==null;
    }
    //push
    public static void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;  //i.e new node becomes head/top itself if stack is empty
            return;
        }
        //if stack is non empty then do this
        newNode.next=head;
        head=newNode;
    }
    //pop
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next; //head gets removed 
        return top;

    }

    //peek
    public static int peek(){
        if(isEmpty()){
            return-1;
        }
        return head.data;
    }


    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

       
    }
    
}
