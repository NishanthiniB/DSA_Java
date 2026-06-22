package stack;

import java.util.Arrays;
import java.util.Stack;

//Similar to nge
public class DailyTemperature {

    static void main() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemp(temperatures)));
    }

    static int[] dailyTemp(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int n=temperatures.length;
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return ans;
    }

}
