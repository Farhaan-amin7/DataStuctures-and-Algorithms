package SuperPackage.DSA_Questions;

public class MedianOfTheSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2,3,5,2};
        double medain = Median(nums1, nums2);
        System.out.println(medain);
    }

    static double Median(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double median = 0.0;
        if (m == 0 && n == 0) {
            return 0.0;
        }
        if(nums1[0] == 0 && nums2[0] == 0 && nums2[1] == 0 && nums1[1] == 0){
            return 0.0;
        }
        if(nums1.length == 0 && nums2.length == 1){
            return (double)nums2[0];
        }
        else if (nums1.length == 1 && nums2.length == 0)
        {
            return (double) nums1[0];
        }
        int[] arr = new int[m + n];
        int absoluteLength = arr.length;

            for (int j = 1; j < m + n; j++) {

                if (j <= m) {
                    arr[j - 1] = nums1[j - 1];
                }
                if (j <= n) {
                    arr[m + (j - 1)] = nums2[j - 1];
                }
            }
            int iterator = 0;
            while (iterator < arr.length - 1) {
                int correct = arr[iterator] - 1;

                if (arr[iterator] != arr[correct]) {
                    swap(arr, iterator, correct);
                } else iterator++;
            }

            int middle = absoluteLength / 2;
            if (absoluteLength % 2 == 0) {
                median = (double)(arr[middle] + arr[middle - 1]) / 2;

            }
            else {
                median = arr[middle];

            }
        return median;
    }


        static void swap ( int[] arr, int i, int correct){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
        }

}