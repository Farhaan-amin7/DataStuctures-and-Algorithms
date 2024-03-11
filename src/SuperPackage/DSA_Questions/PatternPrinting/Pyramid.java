package SuperPackage.DSA_Questions.PatternPrinting;

public class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        PyramidQuestion2(n);

    }
    public static void PyramidQuestion2(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int Spaces = rows; Spaces < n ; Spaces++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}