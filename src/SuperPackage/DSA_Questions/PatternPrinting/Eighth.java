package SuperPackage.DSA_Questions.PatternPrinting;

public class Eighth {
    public static void main(String[] args) {
        int n = 5;
        PatternQuestion8(n);
    }
    public static void PatternQuestion8(int n){
        for (int rows = n; rows > n; rows--) {
            int NoOfCols = rows > n ? 2 * n - rows : rows;
            for (int Spaces = n - rows; Spaces < n; Spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < NoOfCols ; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            
        }
    }
}