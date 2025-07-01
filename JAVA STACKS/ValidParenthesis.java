import java.util.Stack;

public class ValidParenthesis {
    public static boolean validP(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //opening 
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{ //closing
                if(s.isEmpty()){ //for ex:))))) in this no opening brace hence stack is empty and closing braace has no opening so false
                    return false;
                }
                if( (s.peek()=='(' && ch==')') ||
                    (s.peek()=='{' && ch=='}') ||
                    (s.peek()=='[' && ch==']')){
                        s.pop();

                    }else{
                        return false;
                    }

            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        //String str="({[]})";
       // String str="(({[]})";
       String str="))))";
        System.out.println(validP(str));
        
    }
    
}
