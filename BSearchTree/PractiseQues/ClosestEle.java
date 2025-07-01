package BSearchTree.PractiseQues;

public class ClosestEle {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static int Nodevalue=0;
    public static void closestElement(Node root,int k){
        int minDiff=Integer.MAX_VALUE;
        
        if(root==null){
            return;
        }
        if(root.data==k){
            minDiff=0;
            Nodevalue=root.data;
            return;
        }
        int diff=Math.abs(root.data-k);
        if(diff<minDiff){
            
            minDiff=diff;
            Nodevalue=root.data;
        }
        if(k<root.data){
            closestElement(root.left, k);
        }
        
        if(k>root.data){
            closestElement(root.right, k);
        }

       
         
    }
    public static void main(String[] args) {

        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);

        root.right=new Node(11);
        root.right.right=new Node(20);
        closestElement(root, 19);
        System.out.println(Nodevalue);

        
    }
    
}
