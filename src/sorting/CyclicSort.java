package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    static void main() {
        int[] array = {4,3,2,7,8,2,3,1};
      int result = findMissingPositive(array);
      System.out.println(result);

      List<Integer> duplicates = findDuplicates(array);
        System.out.println(duplicates);
    }
    //FIND MISSING POSITIVE [1-N]

    static int findMissingPositive(int[] nums){
        int i=0; int n=nums.length;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else i++;
        }
        for(i=0; i<n; i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return n+1;
    }

    //MISSING NUM [0-N]

    static int missingNum(int[] nums){
//        int i = 0;
//
//        while (i < nums.length) {
//
//            int correct = nums[i];
//
//            if (nums[i] < nums.length &&
//                    nums[i] != nums[correct]) {
//
//                int temp = nums[i];
//                nums[i] = nums[correct];
//                nums[correct] = temp;
//            } else {
//                i++;
//            }
//        }
        Arrays.sort(nums);

        // Find missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        return nums.length;
    }

     //FIND DUPLICATES

    public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        int n =nums.length;

        while(i<n){
            int correct =nums[i]-1;

            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(i=0; i<n; i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    }
