package arrays;

import java.util.Arrays;

public class DutchNationalFlag {
    static void main() {
        int[] array ={2,0,2,1,1,0};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortColors(int[] nums){
        int low=0, mid=0, high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[mid]=temp;
                low++; mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}
