

public class kthLevelOfaTree {
    static class Node{
        Node left;
        int data;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void kthLevel(Node root,int k,int level){
        if(root==null){
            return;
        }
        if(k==level){
            System.out.print(root.data+" ");
            return;
        }
        kthLevel(root.left,k,level+1);
        kthLevel(root.right,k,level+1);
    }
    public static void main(String args[]){
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

        kthLevel(root,3,1);

    }
}
