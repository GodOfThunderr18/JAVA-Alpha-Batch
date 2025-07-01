

import java.util.LinkedList;
import java.util.Queue;

//TC=O(n)
public class BuildTree {

     static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;//for every level the idx must be updated so took static
        public static Node buildTree(int nodes[]){ //function to create tree
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            //if nodes value is not -1 then new Node is created along with its children
            Node newNode=new Node(nodes[idx]);
            //now build  its left side until it becomes null
            newNode.left=buildTree(nodes);
            //if left is null then go right
            newNode.right=buildTree(nodes);

            return newNode; //root node will be returned
        }

        //function to create a preorder tree TC=O(n)
        public static void preorder(Node root){
            if(root==null){
                System.out.print("null ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //function to create inorder tree-LrootR  Tc=O(n)
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        //function to create postorder tree-O(n)
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
         
        //Level order
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root); //initially the root and null are added 
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove(); //first step is to remove that node and chek if its null or not
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){ //i.e we reached end of queue
                    break;
                }else{ //if queue is not null it means that after null still elements presnt so add null again after those elemnts
                    q.add(null);
                } 
            }else{ //if the curr node is not null then print it and add its left and right child into queue if it has those left and right child
                System.out.print(currNode.data+"  ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        int ht=Math.max(lh,rh)+1;
        return ht;
    }

    //count no.of nodes
    public static int treeCount(Node root){
        if(root==null){
            return 0;
        }
        int lc=treeCount(root.left);
        int rc=treeCount(root.right);
        int count=lc+rc+1;
        return count;
    }

    //sum of nodes
    // public static int sumOfNodes(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int ls=sumOfNodes(root.left);
    //     int rs=sumOfNodes(root.right);
    //     int sum=ls+rs+root.data;
    //     return sum;
    // }

    //sum of nodes using bfs
    public static int sumOfNodes(Node root){
        Queue<Node> q=new LinkedList<>();
        int sum=0;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
             
        Node currNode=q.remove();
        if(currNode==null){
            
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            sum+=currNode.data;
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }
        }
        return sum;
    }


    //DIameter of a trree
    //Approach1---O(n2)
    public static int diameter1(Node root){
        if(root==null){
            return 0;
        }
        int ld=diameter1(root.left);
        int rd=diameter1(root.right);
        int lh=height(root.left); //height is the external func which we created above 
        int rh=height(root.right);
        int selfD=lh+rh+1;

        return Math.max(selfD,Math.max(ld,rd));
    }

    //Approach2---O(n)
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }

    }
    public static Info diameter(Node root){
        if(root==null){

            return new Info(0, 0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
 
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    }

       public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        
        tree.preorder(root);
        System.out.println();
        tree.inorder(root); 
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelorder(root);

        System.out.println("height of tree is: "+tree.height(root));
        
        System.out.println("No.of nodes: "+tree.treeCount(root));

        System.out.println("Sumof nodes: "+tree.sumOfNodes(root));

        System.out.println("Diameter of tree is: "+tree.diameter1(root));

        System.out.println("Height of tree: "+tree.diameter(root).ht);
        System.out.println("Diameter of tree: "+tree.diameter(root).diam);


        
    }

    
}
