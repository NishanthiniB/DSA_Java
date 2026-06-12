package binarysearch;

public class SearchMatrix {


    static void main() {
        int[][] matrix =
                {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};

        int target = 30;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m=matrix[0].length;
        int low=0, high=(n*m) -1;

        while(low<=high){
            int mid = low + (high-low) /2;
            int curr = matrix[mid/m][mid%m];

            if(curr==target) return true;
            else if(target>curr){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return false;
    }
}
