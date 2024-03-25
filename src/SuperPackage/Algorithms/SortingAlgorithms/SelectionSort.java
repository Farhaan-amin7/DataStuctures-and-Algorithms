package SuperPackage.Algorithms.SortingAlgorithms;

import java.util.Arrays;
/*
            ************    HOW SELECTION SORT WORKS    ****************
            * WORKS IN TWO WAYS - 1) IN ASCENDING ORDER THAT'S WHAT WE ARE GOING TO DISCUSS HERE.
            *                     2) IN DESCENDING ORDER ( DON'T BE LAZY DO THAT YOURSELF).


        - We take an array or any other data structure as an input.
        - We store the last index of the array in a local variable and on each iteration one element get's sorted that's why we are subtracting the i-th from the length of the array.
        - Firstly we find the IndexOfTheMaximumElement in the array as to put that element on the last index because we want to sort the array in ascending order.
        - After getting the index of the greatest element in the array we swap the index's in such a way that the greatest value get's pushed to the last and the lesser element come's in place of the lower element.
        - NOTE : We actually don't count the greatest element again on another iteration because that's already in it's right place and if we count that, it will be a waste of time to actually compare that value with other unsorted elements.
        - That's why over each i-th iteration we subtract the value of i in the array length.



 arr -> the specified input array.
 lastIndexOfTheArray -> Contains the Last index of the array (arr) and not the value.
 findMaximumValue -> A method that returns the IndexOfTheMaximumElement by searching the entire array. This method takes params - arr(the specified array), The First index of the arr array i.e. 0 and the last index of the arr array.
 IndexOfTheMaximumNumber -> Stores the Index of the maximum element searched in the array (arr) or in any other data structure.
 Swap -> Method that Swaps the minimum value with the maximum value.
 */

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,2,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndexOfTheArray = arr.length - i - 1;
            int IndexOfTheMaximumNumber =  findMaximumValue(arr, 0, lastIndexOfTheArray);
            Swap(arr, IndexOfTheMaximumNumber, lastIndexOfTheArray);
            /*
                Swap takes the params - arr, TheIndexOfTheLargestElement and the IndexOfTheLastElement.
            */

        }
    }
    static void Swap(int[] arr, int IndexOfTheMaximumElement , int IndexOfTheLastElementInTheArray){
        /*
            IndexOfTheMaximumElement -> Has the IndexOfTheMaximum element.
            IndexOfTheLastElementInTheArray -> Has the IndexOfTheLastElement.
            temp -> A local variable that stores IndexOfTheMaximumElement.
         */
        int temp = arr[IndexOfTheMaximumElement];
        arr[IndexOfTheMaximumElement] = arr[IndexOfTheLastElementInTheArray];
        arr[IndexOfTheLastElementInTheArray] = temp;
        /*
            Simply swaps the two number's one being the greatest in the array with the last element.
        */
    }
    static int findMaximumValue(int [] arr, int FirstIndexOfTheArray, int lastIndexOfTheArray){
        /*
        maxIndex -> A local variable that takes the first Index of the array. Then compares the value in that index(0th here) vs the other one's.
         */
        int maxIndex = FirstIndexOfTheArray;
        for (int i = FirstIndexOfTheArray; i <=  lastIndexOfTheArray; i++) {
            /*
                If the value at the  maxIndex is less than the i-th index - that means the i-th index has a greater value than what's in the maxIndex
                And we need the index of the greatest element in the array, that's why we store the i- index in the maxIndex variable.
             */
            if(arr[maxIndex] < arr[i]){
                maxIndex = i;
            }

        }
        return maxIndex;
        // Return's the index of the largest element in the array.
    }

}