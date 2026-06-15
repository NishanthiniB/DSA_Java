package prefix;

public class MaxSubProduct {

    static void main() {
         int[] nums={-2,3,-4};
        System.out.println(maxProd(nums));
    }

    static int maxProd(int[] nums){
        int currentMax=nums[0]; //-2
        int currentMin=nums[0]; //-2
        int answer=nums[0]; //-2

        for(int i=1; i<nums.length; i++){
            int temp=currentMax; //-2 -->3

            currentMax=Math.max(nums[i], Math.max(currentMax*nums[i], currentMin*nums[i])); // 3, -2*3 =-6, -2*3=-6 ||3 -->-4, 3*-4=-12, -6*-4 = 24 ||24
            currentMin=Math.min(nums[i], Math.min(temp*nums[i], currentMin*nums[i])); //3, -2*3=-6, -2*3=-6 ||-6 --> -4, 3*-4=-2, -6*-4=24 || -4

            answer=Math.max(answer,currentMax); //-2,3 --> {3,24} || 24
        }

        return answer;
    }
}
