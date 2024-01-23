package SuperPackage.Algorihtms.SortingAlgorithms;

import java.util.Arrays;

/*
    It's another sorting algorithm, used to sort the array or any other data structure in ascending or descending order.

                                                    #THEHOW It works.
    Basically it sorts the array partially usually beings from the index number one in i iteration, j starts from (1 + i)
    Over each pass the smallest numbers of the partial array are sorted accordingly and the greatest numbers are pushed towards the right hand side of the array.
    J -> Sorts the array in i + j index's starting from 1.

    So the element with the less value is swapped with the element with the biggest value.
    This occurs until the array does not reach length - 1 index.
    - > The values at j and j - 1 are compared and swapped if the condition comes true. And if the j - 1 is already smaller than j then the loop is terminated with the break statement.

                                                #TIMECOMPLEXITY
                                                   O(N) - BEST CASE(AKA LINEAR TIME COMPLEXITY),
                                                   O(N * N) - WORST CASE.
                                                   O(1) - SPACE COMPLEXITY(AKA CONSTANT SPACE COMPLEXITY).


                                                   -> HERE'S THE CODE OF THE ALGORITHM


 */

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {6,5,89,7,1,2};
        InsertionSortAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void InsertionSortAlgorithm(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j =  1 + i; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){

                    SwapThis(arr,j,j - 1);
                }
                else break;
            }
        }
    }
    static void SwapThis(int [] arr, int SmallerValue, int LargerValue){
        int temp = arr[LargerValue];
        arr[LargerValue] = arr[SmallerValue];
        arr[SmallerValue] = temp;
    }
}