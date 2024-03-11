package SuperPackage.DSA_Questions.PatternPrinting;

public class Fifth {
    public static void main(String[] args) {
        int n = 5;
        PatternQuestion5(n);
        
    }
    public static void PatternQuestion5(int n){

        for (int rows = n; rows >= 1; rows--) {
            for (int s = n; s > rows ; s--) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}