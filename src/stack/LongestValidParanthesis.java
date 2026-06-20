package stack;

import java.util.Stack;

public class LongestValidParanthesis {
    static void main() {
        String paranthesis = ")()())";
        System.out.println(longestValidParentheses(paranthesis));
    }
    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int max=0, left=-1;
        for(int j=0; j<s.length(); j++){

            if(s.charAt(j)=='('){
                stack.push(j);
            }
            else{
                if(stack.isEmpty()){
                    left=j;
                }
                else{
                    stack.pop();
                    if(stack.isEmpty()){
                        max=Math.max(max, j-left);
                    }
                    else{
                        max=Math.max(max, j-stack.peek());
                    }
                }
            }
        }
        return max;
    }
}
