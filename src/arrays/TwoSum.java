package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {
         int[] array = {2,5,3,1};
         int[] output = hashApproach(array,7);
        System.out.println(Arrays.toString(output));
    }

    static int[] twoPointerApproach(int[] arr, int target){

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int result = arr[left] + arr[right];
            if(target<result){
                right--;
            }
            else if(target>result){
                left++;
            }
            else{
                return new int[]{left, right};
            }
        }
        return new int[]{-1,-1};
    }

    //HashMap Approach

    static int[] hashApproach(int[] array, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++){
            int currentSum = target - array[i];

            if(map.containsKey(currentSum)){
                return new int[]{map.get(currentSum),i};
            }
            map.put(array[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
