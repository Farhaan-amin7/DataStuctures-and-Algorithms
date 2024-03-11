package SuperPackage.DSA_Questions.PatternPrinting;

public class Seventh {
    public static void main(String[] args) {
        int n =7;
        PatternQuestion7(n);

    }
    public static void PatternQuestion7(int n){
        for (int rows = n; rows >= 0 ; rows--) {
            for (int spaces = rows; spaces < n ; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < rows; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

    }
}