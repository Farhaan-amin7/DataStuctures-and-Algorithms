package SuperPackage.Algorihtms.SortingAlgorithms;
/*\
    It's a very important sorting technique which sorts the array in only one pass i.e. In only one iteration of the (i) loop let's say

                                         *******THE HOW*******
                                         Cyclic sort basically take the value at any index subract's one from that value and if the value after subtraction is equal to the value
                                         of the index, then the element is sorted otherwise the value at the index get's swapped with the the correct value that should be at that index.

                                         ********THE WHY********
                                         Because the time complexity is -> O(N) - Linear complexity. Both best and worst case.
 */
//              Important thing to remember is that cyclic sort only works when numbers are given from a range of 1 - N.
//              It can be edited a bit to accommodate the Negative numbers including 0.

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        CyclicSortAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void CyclicSortAlgorithm(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
           
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }
            else i++;
        }
    }

     static void swap(int [] arr,int i,int correct) {
        int temp = arr[i];
        arr[i]= arr[correct];
         arr[correct] = temp;
    }
}