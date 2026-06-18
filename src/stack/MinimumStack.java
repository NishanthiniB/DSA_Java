package stack;

import java.util.Stack;

public class MinimumStack {
    public Stack<Integer> stack;
    public Stack<Integer> minStack;

    public MinimumStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        if (minStack.isEmpty()) {
            stack.push(val);
            minStack.push(val);
        } else {
            stack.push(val);
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinimumStack obj = new MinimumStack();

        obj.push(5);
        System.out.println("push(5)");

        obj.push(2);
        System.out.println("push(2)");

        obj.push(7);
        System.out.println("push(7)");

        System.out.println("getMin() = " + obj.getMin()); // 2
        System.out.println("top()    = " + obj.top());    // 7

        obj.pop();
        System.out.println("pop()");

        System.out.println("getMin() = " + obj.getMin()); // 2
        System.out.println("top()    = " + obj.top());    // 2

        obj.pop();
        System.out.println("pop()");

        System.out.println("getMin() = " + obj.getMin()); // 5
        System.out.println("top()    = " + obj.top());    // 5
    }
}