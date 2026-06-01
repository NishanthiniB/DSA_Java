package sorting;

public class CyclicSort {
    static void main() {
      int[] array = {3,4,-1,1};
      int result = findMissingPositive(array);
        System.out.println(result);
    }
    static int findMissingPositive(int[] nums){
        int i=0; int n=nums.length;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else i++;
        }
        for(i=0; i<n; i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return n+1;
    }
}
