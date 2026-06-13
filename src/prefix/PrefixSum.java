package prefix;

import java.util.Arrays;

public class PrefixSum {

    static void main() {

        int[] array ={1,2,3,4,5};
        int[] prefix = new int[array.length];
        prefix[0]=array[0];

        for(int i=1; i<array.length; i++){
            prefix[i]=prefix[i-1]+array[i];
        }

        System.out.println("PREFIX SUM: "+Arrays.toString(prefix));

        System.out.println("RANGE SUM: "+rangeSum(prefix, 1, 3));
    }

    //Finding Range

    public static int rangeSum(int[] prefix, int left, int right){
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }

}
