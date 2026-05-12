package arrays;

public class LargestElement {
    static void main() {
        int[] arr ={1000,250,3000,4,5};
        System.out.println("FIRST: "+largestElement(arr));
        System.out.println("SECOND: "+secLargest(arr));
        System.out.println("THIRD: "+thirdLargest(arr));
    }

    static int largestElement(int[] arr){
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }

        }
        return max;
    }

    static int secLargest(int[] arr){
        int largest=arr[0];
        int secondLargest=0;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    static int thirdLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int j: arr){
            if(j>first){
                third=second;
                second=first;
                first=j;
            }
            else if(j>second && j !=first){
                third=second;
                second=j;
            }
            else if (j>third && j!=second && j!=first ){
                third=j;
            }
        }
        return third;
    }
}
