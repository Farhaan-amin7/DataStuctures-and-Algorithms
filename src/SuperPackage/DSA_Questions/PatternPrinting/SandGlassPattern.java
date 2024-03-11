package SuperPackage.DSA_Questions.PatternPrinting;

public class SandGlassPattern {
    public static void main(String[] args) {

        int n = 5;
        PatternQuestion3(n);
    }
    public static void PatternQuestion3(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = n - rows; spaces < n ; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols <= n - rows; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int rows1 = 0; rows1 <= n; rows1++) { // Taking the value of rows1 as: 1 will neglect the first star that we need to print on the top.
            for (int spaces1 = 0; spaces1 < n - rows1 ; spaces1++) {// So take the value of th Rows1 as 0 till n.
                // You might be wondering why that happens that's because:
                System.out.print(" ");
            }
            for (int cols2 = 0; cols2 <= rows1; cols2++) {// In this for loop the first check becomes falst that's why.
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}