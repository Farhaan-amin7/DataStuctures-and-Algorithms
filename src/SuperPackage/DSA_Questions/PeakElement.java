package SuperPackage.DSA_Questions;

public class PeakElement {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,5,7,9,6,4,0};
         int index = FindPealElement(arr);
        System.out.println(index);

    }
     static int FindPealElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
           int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else start = mid + 1;
        }
        return start;
    }

}