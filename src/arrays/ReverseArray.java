package arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
     int[] arr={5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int temp=0;
        int left=0;
        int right=arr.length-1;

        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
