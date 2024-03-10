package SuperPackage.OOPS;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {

        int FirstNumber, SecondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your two number's you want to subtract :");

        FirstNumber = scanner.nextInt();
        SecondNumber = scanner.nextInt();

        int difference = FirstNumber - SecondNumber;

        System.out.println("The difference of the two number's is: " + difference);
    }

}