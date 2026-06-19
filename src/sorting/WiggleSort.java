package sorting;

import java.util.Arrays;

public class WiggleSort {

    static void main() {
         int[] array = {1,5,1,1,6,4};
         wigSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void wigSort(int[] nums){

    Arrays.sort(nums);
    int mid=(nums.length-1)/2;
    int right=nums.length-1;
    int counter=0;
    int[] result = new int[right+1];

    while(mid>=0 || right>(nums.length-1)/2){
        if(counter%2==0){
            result[counter++]=nums[mid--];
        }
        else{
            result[counter++]=nums[right--];
        }
    }

    for(int i=0; i<nums.length; i++){
        nums[i]=result[i];
    }

    //System.arraycopy(result, 0, nums, 0, nums.length);

    }
}



