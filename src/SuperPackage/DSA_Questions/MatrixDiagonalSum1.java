package SuperPackage.DSA_Questions;

public class MatrixDiagonalSum1 {
    public static void main(String[] args) {
        int [][]  mat = {
                {1,2,3},
                {7,6,4},
                {4,9,7}
        };
        int sum = matrixDiagonalSum(mat);
        System.out.println(sum);
    }

    static int matrixDiagonalSum(int[][] mat) {
        int rows = mat.length;
        int DiagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    DiagonalSum += mat[i][j];
                }
                if ((i + j) == mat[i].length - 1) {
                    DiagonalSum += mat[i][j];
                }
            }

        }
        if(rows % 2 == 0){
           return DiagonalSum ;
        }
        else return DiagonalSum - mat[rows /2 ][ rows /2 ];
    }
}