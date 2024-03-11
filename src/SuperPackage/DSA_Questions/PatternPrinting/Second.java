package SuperPackage.DSA_Questions.PatternPrinting;

public class Second {
    public static void main(String[] args) {
        int n = 5;
        PatternQuestion4(n);
    }
    public static void PatternQuestion4(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();

        }
    }
}