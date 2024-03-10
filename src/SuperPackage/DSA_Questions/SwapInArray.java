package SuperPackage.DSA_Questions;


import java.nio.file.attribute.UserDefinedFileAttributeView;

public class SwapInArray {
    public static void main(String[] args) {


        int[] arr = {4, 2}; // It was initially a long array But I resized to 2.
        for (int i = 1; i <=arr.length - 1; i++) {
            if(arr[i] < arr[i - 1]){
                swap(arr,i,i - 1);
            }

        }
        for(int element : arr){
            System.out.println(element);
        }
    }
    static void swap(int [] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }
}