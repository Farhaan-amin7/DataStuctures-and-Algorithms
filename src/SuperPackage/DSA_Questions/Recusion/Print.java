package SuperPackage.DSA_Questions.Recusion;

public class Print {
    public static void main(String[] args) {
        int n = 4;
        int ans = Fibo(n);
        System.out.println(ans);
    }
    static int Fibo(int n){
        if (n < 2){
            return n;
        }
        return Fibo(n - 1) + Fibo(n -2 );
    }
}