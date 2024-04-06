package SuperPackage.DSA_Questions;

public class SplitArray {
    public static void main(String[] args) {

    }
    public  int splitArraySum(int [] nums, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            // Try for the middle for the potential answer.
            int mid = start + (end - start) /2;
            // Calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int element : nums){
                if(sum + element > mid){
                    // You cannot add this in this subarray, make new one
                    // Say you add this num in new Subarray
                    sum = element;
                    pieces++;
                }
                else{
                    sum += element;
                }
                if(pieces > m){
                    start = mid + 1;
                }
                else end = mid;
            }

        }
        return start;
    }
}