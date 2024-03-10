package SuperPackage.OOPS;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        int FirstNumber, SecondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your two number's you want to add :");

        FirstNumber = scanner.nextInt();
        SecondNumber = scanner.nextInt();

        int sum = FirstNumber + SecondNumber;

        System.out.println("The sum of the two number's is: " + sum);
    }
}