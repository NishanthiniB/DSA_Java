package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    static void main() {
        int[] array = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(array);
        System.out.println(result);
    }

    static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i + 1, high = n - 1, target = -nums[i];
                while (low < high) {
                    int currentValue = nums[low] + nums[high];
                    if (currentValue == target) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while (low < high && nums[low] == nums[low + 1]) low++; //Skip Duplicates
                        while (low < high && nums[high] == nums[high - 1]) high++;
                        low++;
                        high--;
                    } else if (currentValue > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }

        }
        return result;
    }
}
