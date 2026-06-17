package arrays;

import java.util.Arrays;

public class SquareOfSortedArrays {

    static void main() {
     int[] nums={-4,-1,0,3,10};
     int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0, right=n-1;
        int[] result = new int[n];
        for(int i=n-1; i>=0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i] = nums[left]*nums[left];
                left++;
            }else{
                result[i] = nums[right]*nums[right];
                right--;
            }

        }
        return result;
    }
}
