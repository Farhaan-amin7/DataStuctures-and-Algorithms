package SuperPackage.DSA_Questions;

public class BinarySearch {  // what I forgot was that in order to find a target using binary search we need to have a sorted array either in acending or decending order

    public static void main(String[] args) {
        int [] arr = {3,5,7,9,14,20,28,5,874,54,98,64,7,4,897,54,8};
        int index = BinarySearchF(arr,897);
        System.out.println("The target is at the index :" + index);
    }
// -> Some rules for binary search are 1)The given array should be sorted Or you can also sort array first.
// -> 2) Two pointers commonly as START and END pointers should be made in use. So that we can find the target in a specific range.
// -> 3) Midpoint should be calculated with the right formula as to compare that the target lies at the left or the right side of the array or a collection.
// -> 4) Comparison of the target element with the mid over each iteration.
//    Time Complexity for worst case is log(N) and the best case it 0(1) which is also called linear time complexity
     static int BinarySearchF(int[] arr, int target) {
//The MID, START and END is nothing but the indexes of the target element(Important point)
//-> START is usually the first element or index which is 0, end is the length of the array and mid has to be calculated on each iteration.
        int start = 0;
        int end = arr.length - 1;
        while (end >= start){
          int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;

            if(target < arr[mid]){
                end = mid - 1;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
     }

}