package stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    static void main() {
        String[] tokens ={"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));

    }
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<Integer>();
        int num1, num2;
        for(String i: tokens){
            switch(i){
                case"+"->stack.add(stack.pop()+stack.pop());
                case"-"->{
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.add(num2-num1);
                }
                case"*"->stack.add(stack.pop()*stack.pop());
                case"/"->{
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.add(num2/num1);
                }
                default->stack.add(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}
