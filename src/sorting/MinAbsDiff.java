package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsDiff {

    static void main() {
        int[] array = {4,3,1,2};
        List<List<Integer>> answer = findMinDiff(array);
        System.out.println(answer);
    }

    static List<List<Integer>> findMinDiff(int[] arr){

        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            int curDiff =arr[i] - arr[i-1];

            if(curDiff<minDiff){
                result=new ArrayList<>();
                minDiff=curDiff;
            }
            if(curDiff==minDiff){
                result.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return result;

    }
}
