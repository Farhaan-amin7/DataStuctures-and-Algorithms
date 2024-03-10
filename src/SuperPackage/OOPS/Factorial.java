package SuperPackage.OOPS;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1, n;
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you the factorial of");

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }

        System.out.println("The factorial of the entered number is :" + fact);

    }
}