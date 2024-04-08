package SuperPackage.Algorithms.BinarySearch;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedMatrix{
    public static void main(String[] args) {
        int [][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,59}
        };
        System.out.println(Arrays.toString(search(mat, 37)));
;
List<ArrayList<Integer>> listt = new ArrayList<>();
    }

    static  int [] BinarySearch(int [][] matrix, int target,int row, int cStart, int cEnd){
        while(cStart <=  cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }

        }
        return new int[] {-1,-1};
    }
    static  int [] search(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            BinarySearch(matrix,target,0,0,cols - 1);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // Run the loop till two rows are remaining.
        while (rStart < rEnd - 1){ // While this is true there ar more than two rows.
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int []{mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        // Now we have two rows
//         Check whether the target in the col of 2 rows.
            if(matrix[rStart][cMid] == target){
                return new int[]{rStart, cMid};
            }
            if(matrix[rStart + 1][cMid] == target)
                return new int[] {rStart + 1, cMid};
        }
        // Search in the first half
        if(target <= matrix[rStart][cMid - 1]){
            return BinarySearch(matrix,target, rStart, 0,cMid - 1);
        }
        // Search in the second half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1] ){
            return BinarySearch(matrix,target, rStart,0,cMid - 1);
        }
        // Search in the third half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return   BinarySearch(matrix,target,rStart + 1,0,cols - 1);
        }
        // Search in the fourth half
        else{
         return BinarySearch(matrix,target,rStart + 1 ,cMid + 1,cols - 1);
        }
    }
}