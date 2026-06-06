package sorting;

import java.util.Arrays;

public class SortColors {

    static void main() {

        int[] nums={2,0,2,1,1,0};
        sortColor(nums);
        System.out.println(Arrays.toString(nums));
    }


    static  void sortColor(int[] nums){
        int low =0, mid =0, high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++; low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
