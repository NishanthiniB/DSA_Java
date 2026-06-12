package binarysearch;

public class FindMinRotatedSearch {

    static void main() {
          int[] array ={3,4,5,1,2};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] nums) {
        int left=0, right=nums.length-1;
        while(left<right){
            int mid = left + (right-left) /2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }

}
