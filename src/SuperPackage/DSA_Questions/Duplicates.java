package SuperPackage.DSA_Questions;

import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int [] left = method(nums, 8);
        System.out.println(Arrays.toString(left));
    }
    public static int [] method(int [] nums, int target){
        int first = duplicates(nums, target);
        int second = dulicate1(nums, target);
        return new int[]{first, second};
    }
    public static int duplicates(int [] nums, int target) {
            int left = 0, right = nums.length - 1;
            int first = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    first = mid;
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return first;
    }
    public static int dulicate1(int [] nums, int target){
        int left = 0, right = nums.length - 1;
        int second = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                second = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return second;
    }
}