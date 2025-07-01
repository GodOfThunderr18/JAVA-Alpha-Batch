package BSearchTree;

public class SizeOfLargestBSt {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }
    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;
        public Info(boolean isBst,int size,int min,int max){
            this.isBst=isBst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxBSTsize=0;
    public static Info largestBST(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        //first we want left subtree and right subtree info
        Info leftInfo=largestBST(root.left);
        Info rightInfo=largestBST(root.right);

        //now we can calculate current node info usimg left and right Info
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        //for isBSt
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        }
        //now since we are out of this loop that means our node satisfies isBSt

        //now check if leftsubtree and rightsubtree are isBST=true and then update maxBSTsize as the node satisfies BSt,lst satusfies bst and right subtree satisfies bst
        if(leftInfo.isBst && rightInfo.isBst){
            maxBSTsize=Math.max(maxBSTsize,size);
            //now update the current node isbst as true
           return new Info(true, size, min, max);
        }

        //if leftsubtree or right subtree is not valid bst then current node cann not be a valid bst so return false

        return new Info(false, size, min, max);
    }








    public static void main(String[] args) {
    /*
    
       50
      / \
     30   60
    / \  / \
   5  20 45 70
            / \
           65  80
    */
Node root=new Node(50);
root.left=new Node(30);
root.left.left=new Node(5);
root.left.right=new Node(20);

root.right=new Node(60);
root.right.left=new Node(45);
root.right.right=new Node(70);
root.right.right.left=new Node(65);
root.right.right.right=new Node(80);

Info info=largestBST(root);
System.out.println("Largest BST size: "+maxBSTsize);
   } 
    
}
