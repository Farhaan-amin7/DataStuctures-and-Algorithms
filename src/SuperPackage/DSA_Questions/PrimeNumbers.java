package SuperPackage.DSA_Questions;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + IsPrime(i));

        }
    }

    static boolean IsPrime(int n) {
        if (n <= 1) {
           return false;
        }
        int i = 2;
        while (i <= (int)Math.sqrt(n)) {
            if ( n % i == 0) {
            return false;
            }
            i++;
        }
        return true;

    }
}