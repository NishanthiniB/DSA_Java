package stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {


    static void main() {

        int[] asteroids = {3,5,-6,2,-1,4};
        int[] result = collision(asteroids);
        System.out.println(Arrays.toString(result));
    }
    static int[] collision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean isDestroyed=false; //alive

            while(!stack.isEmpty()&&asteroid<0&&stack.peek()>0){
                if(stack.peek()<-asteroid){
                    stack.pop();
                }
                else if(stack.peek()==-asteroid){
                    isDestroyed=true;
                    break;
                }
                else{
                    isDestroyed=true;
                    break;
                }
            }
            if(!isDestroyed){
                stack.push(asteroid);
            }
        }

        int[] ans = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            ans[i]=stack.pop();
        }
        return ans;

    }
}
