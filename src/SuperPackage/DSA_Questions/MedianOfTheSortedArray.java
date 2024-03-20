package SuperPackage.DSA_Questions;

import java.util.Arrays;

public class MedianOfTheSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7};
        int[] nums2 = {2,3,5,2};
        System.out.println(nums1.length);
        System.out.println(nums2.length);
        double medain = Median(nums1, nums2);
        System.out.println(medain);
    }

    static double Median(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        System.out.println(m + n );
        double median;
        if (m == 0 && n == 0) {
            return 0.0;
        }
        if(nums1[0] == 0 && nums2[0] == 0 && nums2[1] == 0 && nums1[1] == 0){
            return 0.0;
        }


        int[] arr = new int[m + n];
        int absoluteLength = arr.length;

            for (int j = 0; j < absoluteLength ; j++) {

                if (j < m && m > 0) {
                    arr[j] = nums1[j];

                }
                if (j < n && n > 0) {
                    arr[m + (j)] = nums2[j];
                }
            }

            int iterator = 0;
            while (iterator < arr.length - 1) {
                int correct = arr[iterator] - 1;

                if (arr[iterator] != arr[correct]) {
                    swap(arr, iterator, correct);
                } else iterator++;
            }
                 System.out.println(Arrays.toString(arr));

            int middle = 1 + (absoluteLength / 2);
            if (absoluteLength % 2 == 0) {
                median = (double)((arr[middle] + arr[middle - 1]) / 2);

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