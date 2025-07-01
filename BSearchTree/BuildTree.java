package BSearchTree;

import java.util.ArrayList;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        //if root is null then insert val into node and make it root
        if(root==null){
            root=new Node(val);
            return root;
        }
        //now if value is less than rootval then add to roots left
        if(val<root.data){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    } 

    //search in Bst--O(H)-->Balanced tree case O(log n),worst case in skewed tree O(n)
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        // if(key<root.data){
        //    return search(root.left, key);
        // }else{
        //     return search(root.right, key);
        // }
        return search(root.left, key) || search(root.right, key);
    }



    //Delete a node
    public static Node inordersucc(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;

    }
    public static Node delete(Node root,int val){
        //first search if value is root or its presnt in left or right
        if(val<root.data){
            root.left=delete(root.left, val);
        }
        else if(val>root.data){
            root.right=delete(root.right, val);

        }
        else{//this is the node where value is presnt now check all the 3 cases here and delete accordingly
            //case1:leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2: one child is presnt to the node to be deleted
            if(root.left==null){ //right is the echild to be returned
                return root.right;

            }
            else if(root.right==null){ //left is the echild to be returned
                return root.left;

            }

            //case3: node to be deleted has 2 children
            //1.find inorder successor
            Node IS=inordersucc(root.right); //since IS of a node is the left most node of its right subtree hence search for IS in node's right side
            //2.replace node value with IS value
            root.data=IS.data;
            //delete IS node from right side of the node and up  date the right side
            root.right=delete(root.right, IS.data); //since IS is presnt on right side hence look on right subtree of node and delete IS data
 

        }
        return root;
    }

    //print in range
    public static void range(Node root,int n1,int n2){
        if(root==null){
            return;
        }
        if(root.data>=n1 && root.data<=n2){
            range(root.left, n1, n2);
            System.out.print(root.data+" ");
            range(root.right, n1, n2);
        }
        else if(root.data<n1){
            range(root.right, n1, n2);
        }
        else{
            range(root.left, n1, n2);
        }

    }

    //root to leaf
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void rootToleaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        //if leafnode recahed then print path
        if(root.left==null && root.right==null){
            printPath(path);
        }
        
        rootToleaf(root.left, path);
        rootToleaf(root.right, path);
        //backtracking step
        path.remove(path.size()-1);
    }
    

    //validBST
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        //now check for its left and right subtrees->for lst max is root and for rst min is root
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }




    public static void main(String[] args) {
        int a[]={8,5,3,1,4,6,10,11,14};
        //initially root is null
        Node root=null;

        for(int i=0;i<a.length;i++){
           root= insert(root, a[i]);
        }
        
        //now to check if the tree we got is bst do inorder traversal and if output is sorted then its correct
        inorder(root);
        System.out.println();

        //search
        if(search(root, 7)){
            System.out.print("key is Found");
        }else{
            System.out.print("Not Found");
        }
        System.out.println();
        
        //delete
        root=delete(root, 10);
        System.out.println("After deletetion: ");
        inorder(root);
        System.out.println();

        //range
        System.out.println("Range from n1 to n2: ");
        range(root, 5, 12);
        System.out.println();
        

        //roottoleaf path
        System.out.println("Root to leaf paths:");
        rootToleaf(root, new ArrayList<>());
         
        

        //BST is valid or not
        if(isValidBST(root, null, null)){
            System.out.print("Tree is Valid");
        }else{
            System.out.print("Tree is invalid");
        }
    }
    
}
