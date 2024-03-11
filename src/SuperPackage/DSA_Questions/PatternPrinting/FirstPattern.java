package SuperPackage.DSA_Questions.PatternPrinting;

public class FirstPattern {
    public static void main(String[] args) {
        int n = 50;
        Pattern3(n);
    }

    public static void Pattern3(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 0; cols < n + 1 - rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}