package SuperPackage.DSA_Questions;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        int [] ar = {1,4,4,5,5,7,8};
        int [] temp = new int[2];
        temp = searchRange(ar, 8);
        System.out.println(Arrays.toString(temp));
    }
    public static int[] searchRange(int[] nums, int target) {
        int [] res = new int [2];
        int i = 0;
        int mid = nums.length / 2;
        int end = nums.length - 1;
        if(nums.length == 0){
            return new int[] {-1,-1};
        }
        for(int start = 0; start <= mid; start++){
            if(nums[start] == target){
                res[i] = start;
                i++;
            }
            if(nums[end] == target){
                res[i] = end;
            }
            end--;

        }
        if(res.length == 0){
            return new int[] {-1,-1};
        }
        return res;
    }
}