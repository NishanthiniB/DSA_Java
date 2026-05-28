package sorting;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int low, int high) {

        // base condition
        if (low >= high) {
            return;
        }

        // find middle
        int mid = low + ((high - low) / 2);

        // sort left half
        mergeSort(arr, low, mid);

        // sort right half
        mergeSort(arr, mid + 1, high);

        // merge sorted halves
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }

            index++;
        }

        while (left <= mid) {
            temp[index] = arr[left];
            left++;
            index++;
        }

        while (right <= high) {
            temp[index] = arr[right];
            right++;
            index++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
