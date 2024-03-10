package SuperPackage;

public class AllPrograms {
    public static void main(String[] args) {
        System.out.println(Addition(4, 5));
        System.out.println(Subtraction(6000,3000));
        System.out.println(Multiplication(40, 4));
        System.out.println(Division(50, 10));
        System.out.println(Factorial(8 / 2));

    }

    static int Factorial(int n) {
        int fact = 1;
        if (n < 0) {
            return -1;
        }
        if (n == 1)
            return 1;
        else if (n > 1) {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }


        static long Division ( int a, int b){
        if(b <= 0)
            return -999;
        else
            return a / b;
        }

        static int Multiplication ( int a, int b){
            return a * b;
        }

        static int Subtraction ( int a, int b){
            return a - b;
        }

        static int Addition ( int a, int b){
            return a + b;
        }
    }