package SuperPackage.DSA_Questions;

public class CeilingOfANumber {
    public static void main(String[] args) { // This is not the ceiling of a number this is some what different than that.
        int [] nums = {1};
        int target = 0;
        int as = CeilingOfAarray(nums, target);
        System.out.println(as);
    }
    public static int CeilingOfAarray(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start ) / 2;
            if (target > arr[mid]){
                ans = mid;
                start = mid + 1;
            }
            else if(target < arr[mid]){

                end = mid - 1;
            }
            else return mid;
        }
        return ans + 1;
    }
}