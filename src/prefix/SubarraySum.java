package prefix;

import java.util.HashMap;

public class SubarraySum {

    static void main() {
    int[] nums ={1,1,1};
    int k =2;
        System.out.println(subArraySum(nums, k));
    }

    static int subArraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
    

}
