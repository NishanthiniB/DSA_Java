package binarysearch;

public class FindSmallLetGreThanTarget {


    static void main() {
           char[] letters ={'c','f','j'};
           char target ='a';
           char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low=0, high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(letters[mid]<=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return letters[low%letters.length];
    }
}
