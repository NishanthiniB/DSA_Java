package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaxFreqStack {

    private Map<Integer, Integer> freq;
    private Map<Integer, Stack<Integer>>group;
    private int maxFreq;

    public MaxFreqStack(){
        freq=new HashMap<>();
        group=new HashMap<>();
        maxFreq=0;
    }

    static void main() {
        MaxFreqStack fs = new MaxFreqStack();

        fs.push(5);
        fs.push(7);
        fs.push(5);
        fs.push(7);
        fs.push(4);
        fs.push(5);

        System.out.println(fs.pop()); // 5
        System.out.println(fs.pop()); // 7
        System.out.println(fs.pop()); // 5
        System.out.println(fs.pop()); // 4
    }

   public void push(int val){
        int f = freq.getOrDefault(val,0)+1; //for stack create
        freq.put(val,f);
        maxFreq=Math.max(maxFreq,f);
        group.computeIfAbsent(f,k->new Stack<>()).push(val);
    }

    public int pop(){
        int val = group.get(maxFreq).pop();
        freq.put(val,freq.get(val)-1);
        if(group.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        return val;
    }


}
