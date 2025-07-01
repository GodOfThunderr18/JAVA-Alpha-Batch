public class DoubleLL {

    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  int size=0;

    //add 
    //addFirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode; //this is new for dobly ll
        head=newNode;
    }
    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }

    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    //remove
    //removeFisrt
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        int val=head.data;
        head=head.next;
        size--;
        head.prev=null;
        
        return val;
    }

    //removeLast
    public int removeLast(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        Node prevOftail=tail.prev;
        int val=tail.data;
        prevOftail.next=null;
        size--;
        tail=prevOftail;
        return val;

    }

    //Reverse
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next; //since its a dubkle ll 
            prev=curr;
            curr=next;
        }
        //Now since our curr is null which means our head is prev for the reveresed ll  
        head=prev;
    }

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        System.out.println(dll.size);
        dll.print();

        //dll.removeFirst();
        //System.out.println(dll.size);
        //dll.print();

        //dll.removeLast();
        //System.out.println(dll.size);
        //dll.print();

        dll.reverse();
        dll.print();
        
    }
    
}
