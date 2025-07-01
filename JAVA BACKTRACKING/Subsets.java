public class Subsets {
    public static void findSubsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.print(ans);
            return;
        }
        //recursion
        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str, "", 0);
    }
    
}

//same ques using stringbuilder
/*public class Subsets {
    public static void findSubsets(String str,StringBuilder ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //recursion
        //Yes choice
        findSubsets(str, ans.append(str.charAt(i)), i+1);
        ans.deleteCharAt(ans.length() - 1); //since String builder is mutable,hence first we have to delete the added character and then backtrack  
        //now backtrack 
        //No choice
        findSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str="abc";
        StringBuilder sb=new StringBuilder("");
        findSubsets(str,sb, 0);
    }
    
}*/
