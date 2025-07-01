public class PractiseQuesLL {
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

    /*public static Node intersectionPoint(Node head1,Node head2){
        
        while(head2!=null){
            Node temp=head1;
           while(temp!=null){
              if(temp==head2){
                return head2;
              }else{
                temp=temp.next;
              }
          }
         head2=head2.next;
      }
    return null;
   }
   public static void main(String args[]){
    Node head1,head2;
     head1=new Node(10);
     head2=new Node(3);

     Node nn=new Node(6);
     head2.next=nn;

     nn=new Node(9);
     head2.next.next=nn;

     nn=new Node(15);
     head1.next=nn;
     head2.next.next.next=nn;

     nn=new Node(30);
     head1.next.next=nn;

     System.out.println("Intersection point= "+intersectionPoint(head1, head2).data);*/



     //2nd ques
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
            System.out.println("Linked List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
     }

    //  public Node addMDeleteN(Node head,int M,int N){
    //     Node temp1=head;
    //     int idx1=1;int idx2=1;
    //     while(temp1!=null){
    //         while(idx1<=M){
    //             System.out.print(temp1.data);
    //             temp1=temp1.next;
    //             idx1++;
    //         }
    //         Node temp2=temp1.next;
    //         while(temp2!=null){
    //            while(idx2<=N){
    //               temp2=temp2.next;
    //               idx2++;
    //              }
    //            temp1.next=temp2.next;
              
    //         }

    //     }
    //     return head;
    //  }

    /*public Node addMDeleteN(Node head, int M, int N) {
        Node temp1 = head;
        
        while (temp1 != null) {
            // Step 1: Skip M nodes
            int countM = 1;
            while (countM < M && temp1 != null) {
                temp1 = temp1.next;
                countM++;
            }
            
            // If we reached the end of the list, break
            if (temp1 == null) {
                break;
            }
            
            // Step 2: Delete N nodes after M nodes
            Node temp2 = temp1.next;
            int countN = 0;
            while (countN < N && temp2 != null) {
                temp2 = temp2.next;
                countN++;
            }
            
            // Connect the last node of M nodes to the node after the N nodes
            temp1.next = temp2;
            
            // Move temp1 to the next segment
            temp1 = temp2;
        }
        
        return head;
    }*/



    //3rd ques
    /*public void swap(int x,int y){
        //base case
        if(x==y){
            return;
        }
        Node prevX=null;
        Node currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
            
        } //now after this loop it means that our currx is either null or it is at x that means our prevX is at our required position to make swap work

        Node prevY=null;
        Node currY=head;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
           
        } //now after this loop it means that our currY is either null or it is at Y

        if(currX==null || currY==null){  //i.e if any one key doesnt exist then we cant swap
            return;
        }
        //if currx and curry are not null which means keys exist and are ready to get swapped,now we req prev of keys to do work and make swap work
        if(prevX!=null){
            prevX.next=currY;
        }else{
            head=currY; //i.e if prevX is null it means that x is head and so head itself is to be swapped
        }
        if(prevY!=null){
            prevY.next=currX;
        }else{
            head=currY; //i.e if prevY is null it means that y is head and so head itself is to be swapped
        }
        //update next values of key after swapping
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;



    }
    


     public static void main(String[] args) {
        PractiseQuesLL ll=new PractiseQuesLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);

        ll.print();
        // ll.addMDeleteN(head, 3, 2);
        // ll.print();

        ll.swap(3, 7);
        ll.print();

        
     }*/




     //4th ques
     public Node Evenodd(Node head){
        Node oddDummNode=new Node(-1);
        Node evenDUmmNode=new Node(-1);
        Node odd=oddDummNode;
        Node even=evenDUmmNode;
        Node curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                even.next=curr;
                even=even.next;
                curr=curr.next;
            }else{
                odd.next=curr;
                odd=odd.next;
                curr=curr.next;
            }
        }
        //now we reached end of ll and have 2 ll one is odd and one is even,first make odd ll next as null since we wwant them at end
        odd.next=null;
        //make even next as odddummy.next as it removes -1 of odd ll and add next of eeven ll
        even.next=oddDummNode.next;

        return evenDUmmNode.next;
     }
    public static void main(String[] args) {
        PractiseQuesLL ll= new PractiseQuesLL();
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(6);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        head=ll.Evenodd(head);
        ll.print();

       
        
    }

   

} 


    

