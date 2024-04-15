package SuperPackage.DSA_Questions.Recusion;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromeNumber(121));
    }
    static boolean palindromeNumber(int n){
        return (n == Reverse2(n));
    }
    static int sum = 0;
    static  void Reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
         Reverse(n / 10);
    }
    static int Reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    public static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n  % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}