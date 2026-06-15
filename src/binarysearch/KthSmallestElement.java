package binarysearch;

public class KthSmallestElement {


    static void main() {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        System.out.println("The " + k + "th smallest element is: " + kthSmallest(matrix, k));
    }


    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Staircase traversal: O(n) time, O(1) space
    private static int countLessEqual(int[][] matrix, int target) {
        int n = matrix.length;
        int count = 0;
        int row = n - 1; // Start from bottom-left
        int col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= target) {
                // All elements in this column up to this row are <= target
                count += (row + 1);
                col++; // Move right
            } else {
                row--; // Move up
            }
        }
        return count;
    }
}
