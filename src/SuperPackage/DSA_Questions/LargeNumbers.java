package SuperPackage.DSA_Questions;

import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        int a = 40;
        int b = 389;
        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(68746871);
        BigInteger C = new BigInteger("54245452");
        BigInteger E = new BigInteger("5424545245648565468");
        BigInteger D = BigInteger.TEN;

        int t = B.intValue(); // Convert the biginteger to integer value.

        BigInteger X = C.divide(E);
        BigInteger sX = C.subtract(E);
        System.out.println(X);
        System.out.println(sX);
        if(C.compareTo(E) < 0){
            System.out.println("YES");
        }
    }
}