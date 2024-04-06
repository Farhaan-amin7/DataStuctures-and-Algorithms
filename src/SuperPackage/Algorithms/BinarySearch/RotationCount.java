package SuperPackage.Algorithms.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(countRotations(arr));

    }
    public static int countRotations(int [] arr){
        int pivot = FindThePivot(arr);
//        if(pivot == -1){
//            // Array is not rotated
//            return 0;
//        }
        return pivot + 1;
    }
    // Use this for non duplicates.
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