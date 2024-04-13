package SuperPackage.DSA_Questions.Recusion;

public class RecursionProduct {
    public static void main(String[] args) {
        System.out.println(Product(5));
    }
    static int Product(int n){
        if(n <= 1){
            return 1;
        }
        return n * Product(n - 1);
    }
}