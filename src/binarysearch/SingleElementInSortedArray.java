package binarysearch;

public class SingleElementInSortedArray {

    static void main() {

        int[] array ={1,1,2,3,3,4,4,8,8};
        int result= singleNonDuplicate(array);
        System.out.println(result);

    }
    public static int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }

            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
}
