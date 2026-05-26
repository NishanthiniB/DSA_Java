package arrays;

import java.util.Arrays;

public class ArraySort {
    static void main() {
       int[] array ={5,4,3,1,2};
//        int[] array = {1,2,3,4,5};
       int[] result =insSort(array);
        System.out.println(Arrays.toString(result));
    }

    //Bubble Sort
    static int[] sortArr(int[] array){
            int temp=0;
       for(int i=0; i<array.length; i++) {
           boolean isSwapped = false;
           for (int j = i + 1; j < array.length; j++) {
               isSwapped = true;
               if (array[i] > array[j]) {
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }

           if (!isSwapped) {
               break;
           }

       }
       return array;
    }

//Selection Sort
    static int[] selSort(int[] array){
        for(int i=0; i<array.length-1; i++){
            int minIndex =i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp = array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;

        }
        return array;
    }

 //Insertion Sort

     static int[] insSort(int[] array){
        for(int i=0; i<array.length; i++){
            int key = array[i];
            int j=i-1;
            while(j>=0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]=key;
        }
        return array;
     }
}
