package arrays;

import java.util.Arrays;

public class AllZeroesToEnd {
    static void main() {
       int[] arr = {0,2,3,0,5,0};
       moveZero(arr);
        System.out.println(Arrays.toString(arr));

    }
     static void moveZero(int[] arr){
        int slow=0;
        for(int fast=0; fast<arr.length; fast++){
            if(arr[fast]!=0){
                arr[slow]=arr[fast];
                slow++;
            }
        }
        while(slow<arr.length){
            arr[slow]=0;
            slow++;
        }
     }

}
