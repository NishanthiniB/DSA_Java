package stack;

import java.util.Stack;

public class ValidParenthesis {


    static void main() {
        String s = "([])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
       Stack<Character> stack= new Stack<>();
//        for (char c : s.toCharArray()) {
//
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else {
//
//                if (stack.isEmpty()) return false;
//
//                char top = stack.pop();
//                if ((c == ')' && top != '(') ||
//                        (c == '}' && top != '{') ||
//                        (c == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
        for (char c : s.toCharArray()) {

            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty()|| stack.pop()!=c)
                return false;
        }

        return stack.isEmpty();

    }
}
