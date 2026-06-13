package binarysearch;

public class PeakElement {

    static void main() {
          int[] nums={1,2,1,4,5,6,2}; //return index value
        System.out.println(findPeakElement(nums));
    }

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
}
