package SuperPackage.DSA_Questions;

import java.math.BigInteger;

public class FactorialBignums
{
    public static void main(String[] args) {
        System.out.println(factorial(20));

    }
static BigInteger factorial(int num){
    BigInteger ans = new BigInteger("1");
    for (int i = 2; i < num; i++){
        ans = ans.multiply(BigInteger.valueOf(i));
    }
    return ans;
}
}