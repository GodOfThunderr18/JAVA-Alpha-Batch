

public class SubTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;  //i.e we reached the end and till now all were true   so final ans is true
        }else if(node==null || subroot==null || node.data!=subroot.data){ //if one among them is null and other is not null then false or data is diff then also false
            return false;
        }

        //check for non identical cases on left and right of node and subroot
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubTree(Node root,Node subroot){
        if(root==null){
            return false; //since subroot is not null root cant be null
        }
        if(root.data==subroot.data){ 
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        //if the main root of tree is not the sub root then check for its left part and right part
        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot); //i.e it checks conditions for left subtree and right subtree of main tree and returns tree if subroot tree exists in either left half or right half of main tree
    }
    public static void main(String[] args) {
        /*
               1
              / \
            2     3
          /  \   / \
        4     5  6  7

         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        /*
            2
           / \
         4    5
         */
        Node subroot=new Node(2);
        subroot.left=new Node(4);
         subroot.right=new Node(5);

        System.out.println(isSubTree(root, subroot));

    }
    
}
