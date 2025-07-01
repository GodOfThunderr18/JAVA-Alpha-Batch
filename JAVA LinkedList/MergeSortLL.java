import java.util.LinkedList;

public class MergeSortLL {
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
    

    public static Node midNode(Node head){
        Node slow=head;
        Node fast=head.next; //to get a little change in even case we did a change in fast value
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    public static Node mergeSort(Node head){
        //base case
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=midNode(head);

        //div into two halves
        Node RightHead=mid.next;
        mid.next=null;
        Node leftHalf=mergeSort(head);
        Node rightHalf=mergeSort(RightHead);

        //merge two halves
        return merge(leftHalf,rightHalf);
    }

    public static Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;

        }
        return mergedLL.next; //remove that dummy -1 node and return 

    }

    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public static void print(){
        Node temp=new Node(0);
        temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(5);
        ll.addLast(1);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(2);

        System.out.println("Original LinkedList: " + ll);

        // Transfer elements from LinkedList to custom linked list
        for (int data : ll) {   //The loop reads: "For each integer data in the linked list ll."
            addLast(data);
        }

        // Perform merge sort on the custom linked list
        head = mergeSort(head);

        // Print the sorted linked list
        System.out.print("Sorted LinkedList: ");
        print();
    }
}
