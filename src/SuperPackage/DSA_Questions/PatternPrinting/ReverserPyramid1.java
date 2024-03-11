package SuperPackage.DSA_Questions.PatternPrinting;

public class ReverserPyramid1 {
    public static void main(String[] args) {
        int n = 5;
        PatternPyramidQuestion(n);
    }
    public static void PatternPyramidQuestion(int n){
        for (int rows = 0; rows < n; rows++) {
            for (int spaces = n - rows; spaces < n; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 0; cols < n - rows; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}