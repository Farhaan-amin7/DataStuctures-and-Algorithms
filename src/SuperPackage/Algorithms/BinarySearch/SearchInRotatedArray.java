package SuperPackage.Algorithms.BinarySearch;

import SuperPackage.DSA_Questions.Recusion.BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int [] nums = {2,3,5,9,1,0};
        int pivot = FindThePivot(nums);
        System.out.println(pivot);
    }
    public int search(int [] nums, int target){
        int pivot = FindThePivot(nums);
        if(pivot == -1){
            return BinarySearchNew(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return BinarySearchNew(nums, target, 0, pivot -1);
        }
      return BinarySearchNew(nums, target, pivot + 1, nums.length -1);
        // There can be further cases:
// Case:           - Pivot == target:
// Case:           - Target > start  - Search space  is reduce to pivot - 1:
//                  target < start
//                                  Otherwise search in the Pivot + 1 space. Because all the elements are going to be greater than the start
    }
    public int BinarySearchNew(int [] arr, int target, int start , int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

     static int FindThePivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while( start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return  -1;
    }

}