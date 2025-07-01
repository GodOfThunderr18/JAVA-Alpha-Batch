package BSearchTree;

public class SortedArrayToBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }


    public static Node sortedArraytoBST(int a[],int s,int end){
        if(s>end){
            return null;
        }
        int mid=(s+end)/2;
        Node root=new Node(a[mid]);
        root.left=sortedArraytoBST(a, s, mid-1);
        root.right=sortedArraytoBST(a, mid+1, end);

        return root;
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
        int a[]={3,5,6,8,10,11,12};
        Node root=sortedArraytoBST(a, 0, a.length-1);
        preorder(root);
    }
    
}
