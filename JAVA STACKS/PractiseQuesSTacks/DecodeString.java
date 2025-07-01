package PractiseQuesSTacks;
import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {
                res += s.charAt(idx++);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="3[a2[c]]";
        System.out.println(decodeString(str));
        
    }
}




/* 
Initial State:
Input string: 3[a2[c]]
count = 0
res = ""

Stacks:
countStack = []
resStack = []

Parsing the String:
Step 1: Character '3' (Digit)
count = 10 * count + (s.charAt(idx) - '0'):
Initially, count = 0.
'3' - '0' = 3.
count = 10 * 0 + 3 = 3.
Push count to countStack.
countStack = [3].

Step 2: Character '[' (Open Bracket)
Push res (currently "") to resStack.
resStack = [""].
Reset res = "".

Step 3: Character 'a' (Alphabet)
Append 'a' to res.
res = "a".

Step 4: Character '2' (Digit)
count = 10 * count + (s.charAt(idx) - '0'):
Initially, count = 0.
'2' - '0' = 2.
count = 10 * 0 + 2 = 2.
Push count to countStack.
countStack = [3, 2].

Step 5: Character '[' (Open Bracket)
Push res (currently "a") to resStack.
resStack = ["", "a"].
Reset res = "".

Step 6: Character 'c' (Alphabet)
Append 'c' to res.
res = "c".

Step 7: Character ']' (Close Bracket)
Pop resStack and countStack.
temp = "a" (popped from resStack).
repeatTimes = 2 (popped from countStack).
Repeat res ("c") 2 times and append to temp.
res = "a" + "cc" = "acc".

Step 8: Character ']' (Close Bracket)
Pop resStack and countStack.
temp = "" (popped from resStack).
repeatTimes = 3 (popped from countStack).
Repeat res ("acc") 3 times and append to temp.
res = "" + "accaccacc" = "accaccacc".

Final Output:
Return res = "accaccacc".
*/