package SuperPackage.DSA_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumberInTheMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        List<Integer> list = LuckyNumber(matrix);
        System.out.println(list);

    }
     static List<Integer> LuckyNumber(int [][] matrix) {
        List<Integer> mylist = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int index = 0;
            int min = 9999;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            boolean isture = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[i][index] < matrix[k][index]) {
                    isture = false;
                    break;

                }
            }
            if(isture){
                mylist.add(matrix[i][index]);
            }


        }



         return mylist;
        }

    }