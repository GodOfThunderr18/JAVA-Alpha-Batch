public class Linkedlist {
    public static class Node{ 
    int data;
    Node next;// act as reference variable for the next node
    public Node(int data){ //this is the object of the class Node used to create a node 
        this.data=data;
        this.next=null;
    }
    }
    //a single node is created if we implement this object

    //creating head and tail
    public static Node head; //majority of cases only head is enough to create nodes or do any operations
    public static Node tail;
    public static int size;


    //Methods

     //Add a node

     //add first
     public void addFirst(int data){
        //step1-create new node
        Node newNode=new Node(data);
        size++;
        //base case
        if(head==null){
           head=tail=newNode;
           return;
        }
        

        //step2-new node next is head
        newNode.next=head; //linking step

        //step3-head =newNode
        head=newNode;


     }

     //add Last
     public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }

        tail.next=newNode;
        tail=newNode;

     }



     //print a ll
     public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return; 
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println ("null");
     }



     //add in the middle
     public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){  //i.e until we reach prev idx,travel the temp node
            temp=temp.next;
            i++;
        }
        //now if temp reaches idx-1 i.e i=idx-1
        newNode.next=temp.next;
        temp.next=newNode;
     }

     //Remove a node
     //remove first
     public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;  
        return val;
     }
     

     //remove last
     public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        //prev node--idx=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
             
        }
        //now we are at prev node
        int val=prev.next.data;  //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }



        //Search

        //iterative search-O(n)
    public int iterativeSearch(int key){
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                  return i;

                }else{
                    temp=temp.next;
                    i++;
                }


            }
            return -1;
        }



    //Recursive Search--Tc=O(n )

    public int helper(Node head,int key){
          //base case
          if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;  //if key is found at idx=2,it returns 0 to prev idx in stack,the prev idx adds 1 and returns that value to its prev idx and this continues till idx reaches 0 and idx 0 adds 1 and returns org idx of the key
    }
    public int recSearch(int key){
        return helper(head, key);
      
    }



    //reverse  TC=O(n)
    public void reverse(){
        Node prev=null;  //since we are starting from head and prev of head is null
        Node curr=head; //org was curr=tail=head
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev; //since now curr is null hence its prev is ntg but head for our reverse ll

    }






     

    
    
    
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist(); //we will create all nodes inside this one object
        /*ll.head=new Node(1); //in head node data=1 is stored
        ll.head.next=new Node(2); //in next node of head,data=2 is stored*/
        //But we shouldnt do these in main func....i.e to add or remove or do any other operation on linked list,we create methods and operate there
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5); 
        ll.print();

        ll.add(2,3);
        ll.print();
        //System.out.println(ll.size); 

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();


        
        
        System.out.println(ll.iterativeSearch(10));
        System.out.println(ll.iterativeSearch(4));
        System.out.println(ll.recSearch(3));


        ll.print();
        ll.reverse();
        ll.print();

    }



     
    
}
