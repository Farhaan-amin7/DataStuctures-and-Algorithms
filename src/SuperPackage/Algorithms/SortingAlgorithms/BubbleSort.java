package SuperPackage.Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    /*
    Bubble sort is a sorting algorithm that sorts a data structure.
    With the help of this algorithm we can sort an array in either Ascending or descending order.
    The best case of time complexity is when the array is sorted and that O(N).
    The worst case of time complexity is when the array is sorted in either ascending order or descending order. We want to sort the array other way around. O(N * N).
    This sorting algorithm starts by pushing the largest algorithm to the last index of the array.
    With each step the largest elements in the array are pushed towards the Right side of the array and the small elements come to the front in order.
    Here's the code for the bubble sort.
     */
    public static void main(String[] args) {
        /*
        Let's make a method which sends an array as an argument.
        In many cases bubble sort will return nothing i.e. No extra space used, so we'll return nothing back from the method.
         */
        int [] arr = {5,4,3,2,1};
        BubbleSortingAlgorithm(arr);
    }
    /*
    How bubble sort is implemented:
          - We use two for loops to iterate through every element in the array the outer loop runs till (arr.length)
          - and the inner loops runs till (arr.length - i) I being the pointer - outer loop.
          - we compare two elements of each iteration in the inner loop and subtract (i) element every time inner loops finishes, Why we do that?
          - We subtract the i in the inner loop so that the inner loops won't compare the value of arr.length - 1Th element with the other one cuz that's already the largest number in the array.
          - By reading this code you will understand what I am trying to say.
     */
    static void BubbleSortingAlgorithm(int [] arr){

        boolean flag;
        /*
        We'll declare a boolean to check if the array is already sorted, if Yes finish the program, if No continue the program.

         */

        for (int i = 0; i < arr.length; i++) { // The so-called outer loop.

            flag = false;// Initially it will be false. cuz j has to run arr.length - i times ( basically one if the array is sorted.
            // We'll turn the flag true is the array is not sorted so that break does not execute.


            for (int j = 1; j < arr.length - i; j++) { // The inner loop. comparison happens in this loop only.
                // what we do is we compare the element at first index with the element at the 0th index and if the index at 1st element is larger than the element at the 0th index we swap those two values using at temp variable.

                if( arr[j] < arr[j - 1] ){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[ j - 1] = temp;
                    flag = true;
                    // Flag true means that the break statement will not execute.
                }



            }
            if(!flag){ // Not True = false, Not false = True.
                break;
            }

        }
        System.out.println(Arrays.toString(arr));


    }
}