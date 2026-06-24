package stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

    static void main() {
       int[] array = {10,9,8,7,6};
        System.out.println(previousGreaterElement(array));


    }

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
          Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(arr.length,-1));
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;

    }
    public static ArrayList<Integer> nextSmallerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(arr.length,-1));
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;

    }
    public static ArrayList<Integer> previousGreaterElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(arr.length,-1));
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;

    }
}
