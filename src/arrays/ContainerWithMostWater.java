package arrays;

public class ContainerWithMostWater {

    static void main() {

        int[] nums ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(nums));

    }

    static int maxWater(int[] array){

        int left=0;
        int right=array.length-1;
        int max=0;

        while(left<right){

            int width=right-left;
            int height=Math.min(array[left], array[right]); //Water cannot be higher than the shorter of the two lines, or it would spill over.
            int area=height*width;
            max=Math.max(max,area);

           if(array[left]<array[right]){
                left++;
            }
           else{
               right--;
           }
        }
        return max;

    }

}
