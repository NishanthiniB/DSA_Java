package arrays;

import java.util.Arrays;

public class RotateArray {

    static void main() {
          int[] array = {-1,0,1,2,3};

//        leftRotateArrayByOne(array);
        rightRotateArray(array, 2);
        System.out.println(Arrays.toString(array));
    }

    static void leftRotateArrayByOne(int[] arr){
        int temp = arr[0];

        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    static void rightRotateArray(int[] arr, int k){
        reverse(arr,0, arr.length-1);
        reverse(arr,0, k-1);
        reverse(arr, k, arr.length-1);
    }

    static void reverse(int[] array, int start, int end){

        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++; end--;
        }

    }


}
