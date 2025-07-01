import javax.swing.tree.TreeNode;

public class MinDistBtwin2Nodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    
    public static Node lca(Node root,int n1, int n2) {
                // Base case: null node
                if (root == null) return null;
        
                // If the current node is either p or q, return it
                if (root.data == n1 || root.data == n2) return root;
        
                // Recur for left and right children
                Node left = lca(root.left, n1, n2);
                Node right =lca(root.right, n1, n2);
    
            // If both left and right return a non-null value, current node is LCA
            if (left != null && right != null) return root;
    
            // Otherwise, return the non-null child
            return left != null ? left : right;
        }
        public static int lcaDist(Node root,int n){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }
            int leftDist=lcaDist(root.left, n);
            int rightDist=lcaDist(root.right, n);
            if(leftDist==-1 && rightDist==-1){
                return -1;

            }else if(leftDist==-1){
                return rightDist+1;
            }else{
               return leftDist+1;
            }

        }

    
        public static int minDist(Node root,int n1,int n2){
            //first calculate lca
            Node lca=lca(root,n1,n2);
            int dist1=lcaDist(lca,n1);
            int dist2=lcaDist(lca,n1);

            return dist1+dist2;


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
        int n2=5;
        System.out.println(minDist(root, n1, n2));
    }
    
}
