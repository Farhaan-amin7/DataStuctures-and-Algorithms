package SuperPackage.DSA_Questions.PatternPrinting;

public class Third {
    public static void main(String[] args) {
        int n = 4;
        PatternQuestion4(n);
    }
    public static void PatternQuestion4(int n){
        for (int rows = 1; rows <= 2 * n; rows++) {
            int TotalNumberOfCols = rows > n ? 2 * n - rows : rows;
            for (int cols = 1; cols <= TotalNumberOfCols ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}