package SuperPackage.DSA_Questions.Recusion.RecurrArrays;

public class SortedArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,55,8};
        System.out.println(sorted(arr,0));
    }
    // All objects in the calls are the same, viz Array
    static boolean sorted(int [] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] &&  sorted(arr, index + 1);
    }
}