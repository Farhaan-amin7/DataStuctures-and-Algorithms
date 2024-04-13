package SuperPackage.Algorithms.SortingAlgorithms;

public class RecursionSum {
    public static void main(String[] args) {
        System.out.println(Sum(10));
    }

    static int Sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }
}