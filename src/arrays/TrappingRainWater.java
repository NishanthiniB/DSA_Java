package arrays;

public class TrappingRainWater {
    static void main() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int waterLevel=trap(height);
        System.out.println("WATER STORAGE "+waterLevel);
    }

    public static int trap(int[] height) {
        int n= height.length-1;
        int left=0, right = n, maxLeft=0, maxRight=0, result=0;

        while(left<=right){
            if(height[left]<=height[right]){
                if(height[left]>=maxLeft){
                    maxLeft = height[left];
                }
                else{
                    result+=maxLeft-height[left];
                }
                left++;
            }else{
                if(height[right]>=maxRight){
                    maxRight=height[right];
                }
                else{
                    result+=maxRight-height[right];
                }
                right--;
            }
        }
        return result;
    }
}
