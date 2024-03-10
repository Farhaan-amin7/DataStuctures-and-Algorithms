package SuperPackage.OOPS;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        int FirstNumber, SecondNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two number's you want to multiply:");

        FirstNumber = scanner.nextInt();
        SecondNumber = scanner.nextInt();

        int Product = FirstNumber * SecondNumber;

        System.out.println("The product of the  two number's is: ");

        System.out.println(Product);

    }
}