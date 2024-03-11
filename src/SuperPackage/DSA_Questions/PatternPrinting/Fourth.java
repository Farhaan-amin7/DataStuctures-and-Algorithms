package SuperPackage.DSA_Questions.PatternPrinting;

public class Fourth {
    public static void main(String[] args) {
        int n = 5;
        PatternQuestion4(n);
    }
    public static void PatternQuestion4(int n){
        for (int rows = 0; rows < n; rows++) {

            for (int i = 2 * (n - rows); i >= 0; i--) {
                System.out.print(" ");
            }
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     }

   }