package Tries;

public class PrefixProblem{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int f=1;
        public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }else{
                curr.children[idx].f++;
            }
            curr=curr.children[idx];

        }
        curr.eow=true;
    }
 
    public static void findPrefix(Node root,String ans){  //ans is empty string,we keep on adding char to ans untill f=1,at a node where f=1 we print the ans
        //base case
        if(root==null){ //for dog
            return;
        }
        if(root.f==1){
            System.out.println(ans);
            return; 

        }

        for(int i=0;i<root.children.length;i++){ //in trie check for each node if children exist,if exists then call func for its children and add this node value to ans
            if(root.children[i]!=null){ //valid child is there
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }

    }


    public static void main(String[] args) {
        String arr[]={"zebra","dog","dove","duck"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        //root freq is alwats -1
        root.f=-1;
        findPrefix(root, "");  //TC=O(L) 
    }
}