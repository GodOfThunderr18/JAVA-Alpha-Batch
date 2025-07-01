public class ZigZagLL { 
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;

        }
        tail.next=newNode;
        tail=newNode;


    }

    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");

    }


    public Node midNode(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public void Zigzag(Node head){
        //find midNode
        Node mid=midNode(head);


        //reverse 2nd half
        Node curr=mid.next; //since here we wanted mid in first half hence curr is mid.next and not mid like in palindrome
        mid.next=null; //since we want two halves
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node leftHead=head;
        Node rightHead=prev;
        Node nextL;
        Node nextR;

        //alternate merging
        while(leftHead!=null && rightHead!=null){
            nextL=leftHead.next;  //since we want the next value of left head to be the next of the right head store it in this variable
            leftHead.next=rightHead; 
            nextR=rightHead.next; //since we want this value to be our nextRight head after 1 complete zig zag pattern store it here 
            rightHead.next=nextL;

            //update lefthead nad right head
            leftHead=nextL;
            rightHead=nextR;
        }


         
    }

    public static void main(String[] args) {
        ZigZagLL ll=new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();

        ll.Zigzag(head);

        ll.print();

    }


   
    
}
