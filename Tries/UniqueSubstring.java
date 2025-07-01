package Tries;

public class UniqueSubstring {
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false; //by default its false 

        Node(){
            //first make all children array idx values as null
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
        

    }

    //create a node root which is empty always
    public static Node root=new Node(); 

    public static void insert(String word){ //  O(L)
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }

            curr=curr.children[idx];

        }
        curr.eow=true;
    }


    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;  //that +1 is the self node 
    }




    public static void main(String[] args) {
        String str="ababa"; 

        //step 1 get all suffixes
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            //step 2 insert in trie
            insert(suffix);
        }
    System.out.println(countNodes(root));
    }
    
}
