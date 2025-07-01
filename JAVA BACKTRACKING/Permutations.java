public class Permutations {
    public static void findPer(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans); 
            return;
        }

        //rec 
        for(int i=0;i<str.length();i++){
            //select the curreent char
            char curr=str.charAt(i);
            //delete this curr char from str and add it to the ans String
            String Newstr=str.substring(0, i)+str.substring(i+1);  //if we wwant to remove c from "abcde"="ab"+"de"="abde"
            findPer(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPer(str, "");
        
    }
    
}
