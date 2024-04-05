package SuperPackage.Algorithms.BinarySearch;

public class OrderAgnosticBinarySearch
{
    public static void main(String[] args) {
        int [] arr = {95,87,68,45,32,21,12,6,4,2,1,0};
        System.out.println(OrderAgnosticBS(arr, 87));

    }
    public static int OrderAgnosticBS( int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // Find whether array is sorted in ascending or descending

        boolean IsAsc = arr[start] < arr[end]; // If true this means that the array is in ascending order


        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}