package arrays;

import java.util.Arrays;

public class PartitionArray {

    static void main() {
      int[] array ={9,12,5,10,14,3,10};
      int pivot=10;
      int[] answer = pivotArray(array,pivot);
        System.out.println(Arrays.toString(answer));
    }

    static int[] pivotArray(int[] nums, int pivot){
        int[] result = new int[nums.length];
        int index=0;
        for(int num:nums){
            if(num<pivot){
                result[index++]=num;
            }
        }
        for(int num:nums){
            if(num==pivot){
                result[index++]=num;
            }
        }
        for(int num: nums){
            if(num>pivot){
                result[index++]=num;
            }
        }
        return result;
    }
}
