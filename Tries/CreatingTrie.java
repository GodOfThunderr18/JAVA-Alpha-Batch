package Tries;

public class CreatingTrie {
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


    //search  O(L)
    public static boolean search(String key){
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){ //the character of word not presnt in this level
                return false;
            }

            curr=curr.children[idx];

        }
        //check if eow is true,if true then word exists else it doesnt exist
        return curr.eow==true;


    }


    //WordBreak  O(L)
    public static boolean WordBreak(String key){
        //base case
        if(key.length()==0){
            return true;
        }
        //search substrings of key in trie
        for(int i=1;i<=key.length();i++){ //see notes as in why loop starts from 1
            if(search(key.substring(0,i)) && WordBreak(key.substring(i))){

                return true;
            }

             
        }

        return false;
    }   

    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int level=0;level<prefix.length();level++){
            int idx=prefix.charAt(level)-'a';
            if(curr.children[idx]==null){ //the character of word not presnt in this level
                return false;
            }

            curr=curr.children[idx];

        }
        
        return true;


    }
    public static void main(String[] args) {
        //String words[]={"the","a","there","their","any","thee"};
        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }

        // System.out.println(search("thee"));
        // System.out.println(search("thor"));


        // String wordDict[]={"i","like","sam","samsung","mobile"};
        // for(int i=0;i<wordDict.length;i++){
        //     insert(wordDict[i]);
        // }
        // String key="ilikesams";
        // System.out.println(WordBreak(key));

        String arr[]={"man","apple","mango","app"};
        String prefix1="app";
        String prefix2="man";
        String prefix3="moon";
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
        System.out.println(startsWith(prefix3));
         

    }
    
}
