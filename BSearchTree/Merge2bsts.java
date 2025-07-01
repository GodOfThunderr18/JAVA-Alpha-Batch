package BSearchTree;

import java.util.ArrayList;

public class Merge2bsts {
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
    public static Node createBalancedBST(ArrayList<Integer> l,int s,int e){
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        Node root=new Node(l.get(mid));
        root.left=createBalancedBST(l, s, mid-1);
        root.right=createBalancedBST(l, mid+1, e);

        return root;
    }


   

    public static Node mergeBsts(Node root1,Node root2){  //O(n+m)
        //step1
        ArrayList<Integer> arr1=new ArrayList<>();
        getInorder(root1,arr1);
        //step2
        ArrayList<Integer> arr2=new ArrayList<>();
        getInorder(root2,arr2);
        //step3-->Merge arr1 and arr2
        int i=0,j=0;
        ArrayList<Integer> finalarr=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }else{
                finalarr.add(arr2.get(j));
                j++;
            }
        }
        //leftover elements
        while(i<arr1.size()){
            finalarr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalarr.add(arr2.get(j));
            j++;
        }

        //step4-->create balanced Bst using final arr
        Node root=createBalancedBST(finalarr, 0, finalarr.size()-1);

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
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);


        Node root=mergeBsts(root1, root2);

        preorder(root);

    }
    

    
}
