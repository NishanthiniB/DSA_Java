package binarysearch;

import java.util.Arrays;

public class FirstAndLastOccurence {

    static void main() {

        int[] nums ={5,7,7,8,8,10};
        int target =8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target){

        int start=binarySearch(nums, target);
        if(start==nums.length || nums[start]!=target) return new int[] {-1,-1};

        return new int[]{start, binarySearch(nums, target+1) -1};

    }

    private static int binarySearch(int[] nums, int target) {

        int left=0, right=nums.length;

        while(left<right){
            int mid=(left+right)/2;

            if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}
