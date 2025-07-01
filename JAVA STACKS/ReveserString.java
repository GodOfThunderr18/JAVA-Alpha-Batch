import java.util.*;

public class ReveserString {

    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        //first we add each char of string into a stack
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        //now pop one by one and add it to a newstring/StringBuilder
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop(); //we will get top element,innext step add it to sb
            sb.append(curr);
        }
        return sb.toString(); //string builder aint a string so convert it into string and then return

      
    }

    public static void main(String[] args) {
        String str="hello ";
        System.out.println(reverse(str));
        
    }
    
}
