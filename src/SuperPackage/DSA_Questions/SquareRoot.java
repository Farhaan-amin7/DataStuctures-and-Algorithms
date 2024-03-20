package SuperPackage.DSA_Questions;

public class SquareRoot {
    public static void main(String[] args) {


        int n = 40;
        int p = 3;
        System.out.printf("The squar root of this number is: %.3f",SquareRootOfThisNumber(n, p));
    }

    public static double SquareRootOfThisNumber(int n, int precesion){
        double root = 0.0;
        int end = n;
        int start = 0;

        while (start <= end) {


            int m = start + (end - start) / 2;

            if (m * m == n) {
                return m;
            }
            if (m * m > n) {
                end = m - 1;
            } else
                start = m + 1;
        }
        root = end;
        double increment = 0.1;
        for (int i = 0; i < precesion; i++) {
            while (root * root <= n){
                root+= increment;
            }
            root -=increment;
            increment /=10;
        }
        return root;
    }
   
}