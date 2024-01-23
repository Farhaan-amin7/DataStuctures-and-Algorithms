package SuperPackage.DSA_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysRevised {
    public static void main(String[] args) {
        int [] arr = new int [5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int j = arr.length - 1 ; j >= 0 ; j--) {
            System.out.print("[ " + arr[j] +" ]");
        }
    }
}