package binarysearch;

public class PeakElement {

    static void main() {
          int[] nums={1,2,1,4,5,6,2}; //return index value
        System.out.println(findPeakElement(nums));
    }


    //using binary search
    public static int findPeakElement(int[] nums) {
        int left=0, right=nums.length-1;

        while(left<right){
            int mid=left+ (right-left) /2;

            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    //linear Search

    static int findElement(int[] nums){
        if (nums.length == 1) return 0;
        if (nums[0] >= nums[1]) return 0;
        if (nums[nums.length - 1] >= nums[nums.length - 2]) return nums.length - 1;

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
