import java.util.ArrayList;

public class LastCommonAncestor {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        //if root is not the required node then CHECK for left and right sub trees
        boolean foundLeft=getPath(root.left, n, path);
        boolean foundRight=getPath(root.right, n, path);
        //if the node is found in leftsubtree or right subtree then return true
        if(foundLeft || foundRight ==true){
            return true;
  
        }
        //if not found in left or right subtree thrn remove that node from list
        path.remove(path.size()-1);
        return false;

    }


    public static Node lca(Node root,int n1,int n2){   //TC=O(n)  SC=O(n) cause we used two differnt arraylist
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //lca
        int i;
        for(i=0;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        //last equal node is at i-1th node since whn we got break from loop i was at unequal nodes value so its previous value is the last common element
        Node lca=path1.get(i-1);

        return lca;

    }
    //Approach2
    public static Node lca2(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root; //case1: if root itself is one of the node then it is only the lca or if root is null then return null
        }
        //if its not the case then find whther nodes are prestn in leftsubtree or rightsubtree
        Node leftLca=lca2(root.left,n1,n2);
        Node rightLca=lca2(root.right,n1,n2);
        //case2 : if leftLca itself has both nodes and rightLca doesnt conatin any node i.e if it return null then return leftlca .....same for left null and right valid
        if(rightLca==null){
           return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        //case3:if both sides are not null i.e in left sub tree one node exists and right subtree one node exists then root itself is the lca
        return root;

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
        int n1=4;
        int n2=7;
        System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root,n1,n2).data);
    }
    
}
