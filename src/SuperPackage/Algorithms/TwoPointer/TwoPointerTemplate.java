package SuperPackage.Algorithms.TwoPointer;
// This is the optimized two pointer Approach.
public class TwoPointerTemplate {
    public static void main(String[] args) {
        int [] arr = {6,2,3,4,7,2,1,7,0};
        int k = 4;
        System.out.println(TwoPointerWindowAlgorithm(arr, k));
    }
    public static int TwoPointerWindowAlgorithm(int [] arr, int k){
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        if(arr.length < k){
            return sum;
        }
        int leftSum = 0, maxSum = 0, rightSum = 0;
        for (int i = 0; i <= k - 1; i++) {
            leftSum += arr[i];
            maxSum = leftSum;
        }
        int rightIndex = arr.length - 1;
            for (int i = k - 1; i > 0; i--) {
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        System.out.println("The maximum sum is: " + maxSum);
        return maxSum;
    }
}