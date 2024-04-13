package SuperPackage.DSA_Questions.Recusion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(1342 / 10);
        System.out.println(DigitSum1(1342));
    }
    // n-- Pass the value first and then subtract the number.
    // --n Subtract the number first then pass it.
    static  int DigitSum1(int n){
        if(n  % 10 == n){
            return n;
        }
        return (n % 10) + DigitSum1(n / 10);
    }
}