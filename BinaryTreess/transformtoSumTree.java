public class transformtoSumTree {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
        
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftchild=transform(root.left);
        int rightchild=transform(root.right);

        int data=root.data; //first store the original rootdata before adding sum of its left and right sub tree(this data should be returned to its parent as its left or right child)
        int newLeft = (root.left == null) ? 0 :root.left.data; //if leafnode then rootleft is null and hence it wont have data so it should be 0
        int newRight = (root.right == null) ? 0 :root.right.data;
        root.data=leftchild+rightchild+newLeft+newRight; //for example node 2 leftchild=4,rightchild=5,newLeft=0,newRight=0

        return data;
        
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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
        transform(root);
        preorder(root);

        
    }
    
}
