public class LLQuestions {
    
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {            // If the list is empty
            head = tail = newNode;      // Head and tail both point to the new node
        } else {
            newNode.next = head;        // Point newNode's next to the current head
            head = newNode;             // Update head to be the new node
        }
        size++; // Increment the size
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //To delete nth node from end
    public void deleteNthNodefromEnd(int n){
        //calculate size of ll first---use in contests
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){ //i.e nth element from last becomes head 
            head=head.next; //head is removed
            return;

        }
        //we have to reach sz-n node
          int i=1;
          int iTofind=sz-n;
          Node prev=head;
          while(i<iTofind){
            prev=prev.next;
            i++;  
          }
          //now we are at sz-n
          prev.next=prev.next.next;
    }



    //LL is palindrome or not
    //FInd midNode
    public Node findMid(Node head){ 
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now at this point either its even case where fast is null or odd case where fast.next is null hence at this point slow is our midNode
        return slow;

    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true; //i.e if ll is empty or ll has only 1 node then automatically it becomes palindrome
        }
        //step-1 Find mid
        Node midNode=findMid(head);



        //step-2 Reverse 2nd half
        Node prev=null;
        Node curr=midNode; //since we aare making 2nd half reverse hence we start from midnode
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //now after curr becomes null, prev becomes head of the right half which was reversed 
        Node right=prev;
        Node left=head;

        //step-3 Vheck left half =right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }else{
                left=left.next;
                right=right.next;
            }
            
        }
        return true;

    }


    //Cycle exists or not
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        //now if that while condition is not satisfied which means fast is null or fast.next is nulll which means its a linear linked list
        return false;

    }



    //Remove cycle
    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return; //i.e we dont need to check further as it doesnt contain a loop to get removed
        }
        
        //find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        //now our slow is equal to fast which means now prev node is our last  node

        //remove cycle
        prev.next=null;
    }








     /*public static void main(String[] args) {
        LLQuestions ll = new LLQuestions(); // Instantiate LLQuestions, not Linkedlist
       ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print(); 

        //ll.deleteNthNodefromEnd(3);
        //ll.print();

        System.out.println(ll.isPalindrome());*/


        public static void main(String[] args) {
            head=new Node(1);  
            head.next=new Node(2);
            head.next.next=new Node(3);
            head.next.next.next=head.next;
            System.out.println(isCycle());
            removeCycle();
            System.out.println(isCycle());


            
        

      
        



        
    }
}

