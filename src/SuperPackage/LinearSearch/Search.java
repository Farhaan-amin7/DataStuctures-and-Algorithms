package SuperPackage.LinearSearch;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {45,78,8},
                {8,564,45,1,7,74}
        };
        int target = 564;
        int [] ans = searchInTheArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int [] searchInTheArray(int [][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int cols = 0; cols < arr[row].length; cols++) {
                if(arr[row][cols] == target){
                    return new int[]{row,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
}