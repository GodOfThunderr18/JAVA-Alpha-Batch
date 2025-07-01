

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void TopView(Node root){
        //Level Order Traversal
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();

        int min=0;
        int max=0;
        q.add(new Info(root,0));//root has default hd=0
        q.add(null);

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){ //if hd doesnt contain in map then add the hd in map
                    map.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1)); //since hd of left child is hd of parent-1
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }  
            }
            
        }

        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");

        }

        
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

        TopView(root);

    
    }
    
}
