package SuperPackage.DSA_Questions.PatternPrinting;

public class Sixth{
    public static void main(String[] args) {
        int n = 5;
        PatternQuestion6(n);
    }
    public static void PatternQuestion6(int n){
        for (int rows = 0; rows <= n; rows++) {
            for (int spaces = n - rows; spaces >= 1 ; spaces--) {
                System.out.print(" ");
            }
            for (int cols = 0; cols <= rows; cols++) {
                System.out.print("* ");

            }
            System.out.println();
            
        }
    }

}