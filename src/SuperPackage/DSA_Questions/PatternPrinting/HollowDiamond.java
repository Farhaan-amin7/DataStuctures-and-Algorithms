package SuperPackage.DSA_Questions.PatternPrinting;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 8;
        PatternQuestion8(n);
    }
    public static void PatternQuestion8(int n) {
        for (int rows = 1; rows <= n; rows++) {

            for (int Spaces = n ; Spaces > rows; Spaces--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int cols = 1; cols < 2 * (rows - 1); cols++) {
                System.out.print(" ");
            }
            if (rows == 1) {
                System.out.println("");
            }
            else {
                System.out.println("*");
            }
        }
        for (int rows = n - 1; rows >= 1; rows--) {
            for (int s = n; s > rows; s--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int spaces = 1; spaces < 2 * (rows - 1); spaces++) {
                System.out.print(" ");
            }
            if (rows == 1) {
                System.out.println();
            }
            else {
                System.out.println("*");
            }

        }
    }
}