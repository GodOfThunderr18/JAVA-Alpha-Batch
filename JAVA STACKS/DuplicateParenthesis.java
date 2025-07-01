import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean dupParenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                //now we reached (
                if(count<1){
                    return true; //duplicate 
                }else{
                    s.pop(); //remove that pair and check next
                }
            }else{ //opening,opernads and operators case
                s.push(ch);

            }


        }
        return false;

    }
    public static void main(String[] args) {
        //String str="(a+b)+(c+d)";
        String str="(((a+b)))+(c+d))";
        System.out.println(dupParenthesis(str));
        
    }
    
}
