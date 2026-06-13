package prefix;

public class PivotIndex {

    static void main() {
     int[] array ={2,1,-1};
        System.out.println(pivotInd(array));
    }

    static int pivotInd(int[] array){
        int totalSum=0;

        for(int i=0; i<array.length; i++){
            totalSum+=array[i];
        }

        int leftSum=0;
        for(int i=0; i<array.length; i++){
            int rightSum = totalSum-leftSum-array[i];

            if(rightSum==leftSum){
                return i;
            }
            leftSum+=array[i];
        }
        return -1;
    }
}
