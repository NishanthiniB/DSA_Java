package arrays;

public class RemoveDuplicatesII {

    static void main() {
      int[] nums={0,0,1,1,1,1,2,3,3};
        System.out.println("ORIGINAL LENGTH: " + nums.length);
        System.out.println("AFTER REMOVE DUPP THE ARRAY'S LENGTH: "+removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums){
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
