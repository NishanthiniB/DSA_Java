package arrays;

public class RemoveDuplicate {
    static void main() {
     int[] arr ={1,1,2,2,3,3};
        int length = remove(arr);

        System.out.println("Unique count: " + length);

        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int remove(int[] arr){
        int slow=0;
        for(int fast=1; fast<arr.length; fast++){
            if(arr[fast]!=arr[slow]){
                slow++;
                arr[slow]=arr[fast];

            }
        }
        return slow+1;
    }
}
