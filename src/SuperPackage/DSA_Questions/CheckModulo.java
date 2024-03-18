package SuperPackage.DSA_Questions;

import java.math.BigInteger;

public class CheckModulo {
    public static void main(String[] args) {
//         String sum = what("100", "1");
//        System.out.println(sum);
        char c = '1';
        int num = c - '0';
        long num1 = 264373432;
        long signedInt1 = Integer.toUnsignedLong(1000000);
        System.out.println(num);
//         int a = 3;
//        int b = 9;
//       int result =  CheckModuloOneToN(b,1) ^ CheckModuloOneToN(a - 1,1) ;
//        System.out.println(result);
//        int ans = 0;
//        for (int i = a; i <= b; i++) {
//            ans = ans ^ i;
//
//        }
//        System.out.println(ans);


    }
    static int CheckModuloOneToN(int a,int second){

        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
           return (a + 1);
        }
       return 0;


    }
    static String what (String a, String b){
        StringBuilder sum = new StringBuilder();
        BigInteger string = new BigInteger(a,2);
        BigInteger string1 = new BigInteger(b,2);
       long a1 = string.intValueExact();
        long b2 = string1.intValueExact();
        long sum1 = a1 + b2;
        return Integer.toBinaryString((int) sum1);
    }
}