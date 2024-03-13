package SuperPackage.DSA_Questions.Recusion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,55,66,78,89};
        int target = 89;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(BinarySearchRecursive(arr,target, start, end));

    }
    static int BinarySearchRecursive(int [] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/ 2;

        if(arr[mid] == target){
            return mid;
        }

        if (target < arr[mid]) {
           return BinarySearchRecursive(arr, target, start, mid - 1);
        }
        return BinarySearchRecursive(arr, target, mid + 1, end);


    }
}