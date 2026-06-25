package stack;

import java.util.Stack;

public class ImpleQueueUseStack {

    Stack<Integer> input;
    Stack<Integer> output;

    public ImpleQueueUseStack() {
        input=new Stack<>();
        output=new Stack<>();

    }

    static void main() {
        ImpleQueueUseStack q = new ImpleQueueUseStack();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed: " + q.pop());

        System.out.println("Front Element: " + q.peek());

        q.push(40);

        System.out.println("Removed: " + q.pop());
        System.out.println("Removed: " + q.pop());

        System.out.println("Front Element: " + q.peek());

        System.out.println("Is Queue Empty? " + q.empty());

        System.out.println("Removed: " + q.pop());

        System.out.println("Is Queue Empty? " + q.empty());

    }

    public void push(int x) {
        input.push(x);

    }

    public int pop() {
        if (output.isEmpty()) {

            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();

    }

    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();

    }

    public boolean empty() {
        return input.isEmpty()&& output.isEmpty();

    }
}
