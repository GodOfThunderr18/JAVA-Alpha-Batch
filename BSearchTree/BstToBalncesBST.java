package BSearchTree;

import java.util.ArrayList;

public class BstToBalncesBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }

    public static void getInorder(Node root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        getInorder(root.left, l);
        l.add(root.data);
        getInorder(root.right, l);

    }
    public static Node createBalancedBSt(ArrayList<Integer> l,int s,int ei){
        if(s>ei){
            return  null;
        }
        int mid=(s+ei)/2;
        Node root=new Node(l.get(mid));
        root.left=createBalancedBSt(l, s, mid-1);
        root.right=createBalancedBSt(l, mid+1, ei);
        return root;
    }

    public static Node balanceBSt(Node root){  //O(n)
        //inorder seq-O(n)
        ArrayList<Integer> l=new ArrayList<>();
        getInorder(root, l);

        //sorted inorder-->Balanced BSt O(n)
        root=createBalancedBSt(l, 0, l.size()-1);

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
    /*
            8
           / \
          6   10
        /       \
       5         11 
      /           \
     3             12
     */      
    Node root=new Node(8);
    root.left=new Node(6);
    root.left.left=new Node(5);
    root.left.left.left=new Node(3);
    
    root.right=new Node(10);
    root.right.right=new Node(11);
    root.right.right.right=new Node(12);

    root=balanceBSt(root);
   /*
    output:
       8
      / \
     5   11
    / \  / \
   3  6 10  12
    */
    preorder(root);
    }

    
}
