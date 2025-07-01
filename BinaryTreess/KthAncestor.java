public class KthAncestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static int kAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        //if the node is not the required node then check on left and right side
        int leftDist=kAncestor(root.left, n, k);
        int rightDist=kAncestor(root.right, n, k);
        //if both sides no node then return -1
        if(leftDist==-1 && rightDist==-1){
            return -1;
        }
        //if one side node is there then it is positive value(0) so it will be max among both sides(since other side is -1)
        int max=Math.max(leftDist,rightDist);
        //now check if max+1 i.e the distance of req node from curr node is the kth distance and if yes then curr node is   only the kth ancestor
        if(max+1==k){
            System.out.println(root.data);
        }
        //if its not kth then just return its distance from node
        return max+1;
        
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
                /*
               1
              / \
            2     3
          /  \   / \
        4     5  6  7

         */
        int n=4;
        int k=2;
        kAncestor(root,n,k);  
    }
    
}
